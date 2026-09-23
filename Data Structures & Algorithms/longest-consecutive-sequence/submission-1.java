class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxCount = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {
                int count = 1;
                while (true) {
                    if (!set.contains(num+count)) {
                        break;
                    }
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }
}
