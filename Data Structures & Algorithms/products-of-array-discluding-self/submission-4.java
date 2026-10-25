class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        int leftProd = 1;
        for (int i = 0; i < length; i++) {
            answer[i] = leftProd;
            leftProd *= nums[i];
        }

        int rightProd = 1;
        for (int i = length -1; i >= 0; i--) {
            answer[i] *= rightProd;
            rightProd *= nums[i];
        }

        return answer;
    }
}  
