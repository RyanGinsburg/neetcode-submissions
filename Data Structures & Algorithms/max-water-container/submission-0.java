class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int leftNum = heights[left];
            int rightNum = heights[right];
            int height = Math.min(leftNum, rightNum);
            int width = right-left;
            int area = height*width;
            if (area > maxArea) {
                maxArea = area;
            }
            if (leftNum < rightNum) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
