class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) {
            return false;
        }

        for (int i = 0; i < sLength; i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);
            map.put(sLetter, map.getOrDefault(sLetter, 0) + 1);
            map.put(tLetter, map.getOrDefault(tLetter, 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
