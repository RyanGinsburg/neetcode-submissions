class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int[] keyArray = new int[26];
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                keyArray[letter - 'a']++;
            }
            String key = Arrays.toString(keyArray);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
