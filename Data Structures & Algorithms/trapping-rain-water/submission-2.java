class Solution {
    public int trap(int[] height) {
        int water = 0;
        int length = height.length;

        int[] leftMaxArr = new int[length];
        int[] rightMaxArr = new int[length];
        int leftMax = 0;
        int rightMax = 0;

        for (int i = 0; i < length; i++) {
            int num = height[i];
            if (num > leftMax) {
                leftMax = num;
            }
            leftMaxArr[i] = leftMax;
        }

        for (int i = length-1; i >= 0; i--) {
            int num = height[i];
            if (num > rightMax) {
                rightMax = num;
            }
            rightMaxArr[i] = rightMax;
        }

        for (int i = 0; i < length; i++) {
            water += (Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i]);
        }

        return water;
    }
}