class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length-1;

        while (left < right) {
            int width = right - left;
            int leftHeight = heights[left];
            int rightHeight = heights[right];

            int height = Math.min(leftHeight, rightHeight);
            int area = height * width;
            if (area > maxArea) {
                maxArea = area;
            }

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
