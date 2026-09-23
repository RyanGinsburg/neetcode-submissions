class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        int index = 0;
        HashMap<String, Integer> keys = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int[] count = new int[26];
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                count[letter - 'a']++;
            }
            String key = Arrays.toString(count);
            if (keys.containsKey(key)) {
                groups.get(keys.get(key)).add(word);
            } else {
                groups.add(new ArrayList<>());
                groups.get(index).add(word);
                keys.put(key, index);
                index++;
            }
        }
        return groups;
    }
}
