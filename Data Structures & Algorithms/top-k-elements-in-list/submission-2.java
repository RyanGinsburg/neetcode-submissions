class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        List<Integer>[] buckets = new List[nums.length+1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            buckets[frequency].add(key);
        }

        int count = 0;
        int frequency = nums.length;
        while (count < k) {
            for (int i = 0; i < buckets[frequency].size() && count < k; i++) {
                answer[count] = buckets[frequency].get(i);
                count++;
            }
            frequency--;
        }
        return answer;
    }
}
