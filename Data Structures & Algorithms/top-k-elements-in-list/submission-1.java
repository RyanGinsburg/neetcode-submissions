class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }

        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            buckets[value].add(key);
        }

        int count = 0;
        int i = nums.length;
        while (count < k) {
            for (int j = 0; j < buckets[i].size() && count < k; j++) {
                answer[count] = buckets[i].get(j);
                count++;
            }
            i--;
        }
        return answer;
    }
}
