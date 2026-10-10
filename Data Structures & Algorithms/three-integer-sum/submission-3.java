class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (i != 0 && nums[i - 1] == num) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int target = -num;

            while (left < right) {
                int leftNum = nums[left];
                int rightNum = nums[right];

                if (leftNum + rightNum == target) {
                    answer.add(List.of(num, leftNum, rightNum));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (leftNum + rightNum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return answer;
    }
}