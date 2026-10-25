class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            set.add(num);
        }

        int maxCount = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {
                int count = 1;
                while (set.contains(num+count)) {
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
