class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.putIfAbsent(num, i);
            
        }
        return new int[]{0,0};
    }
}
