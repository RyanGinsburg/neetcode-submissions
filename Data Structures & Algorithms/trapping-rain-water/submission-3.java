class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int water = 0;

        int leftMax = 0;
        int rightMax = 0;
        int[] leftMaxArr = new int[length];
        int[] rightMaxArr = new int[length];

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
            int num = height[i];
            int leftMaxNum = leftMaxArr[i];
            int rightMaxNum = rightMaxArr[i];
            water += Math.min(leftMaxNum, rightMaxNum) - num;
        }

        return water;
    }
}
