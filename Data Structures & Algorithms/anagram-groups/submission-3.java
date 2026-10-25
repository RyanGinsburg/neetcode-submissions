class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String word : strs) {
            int[] letters = new int[26];
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                letters[letter-'a']++;
            }
            String key = Arrays.toString(letters);

            if (map.containsKey(key)) {
                int index = map.get(key);
                answer.get(index).add(word);
            } else {
                int index = answer.size();
                map.put(key, index);
                List<String> list = new ArrayList<>();
                list.add(word);
                answer.add(list);
            }
        }
        return answer;
    }
}
