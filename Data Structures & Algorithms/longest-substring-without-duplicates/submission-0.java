class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = left;
        HashSet<Character> set = new HashSet<>();

        int length = 0;
        while (right < s.length()) {
            char letter = s.charAt(right);
            if (set.contains(letter)) {
                if (right-left > maxLength) {
                    maxLength = right-left;
                }
                while (set.contains(letter)) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(letter);
            right++;
        }
        return Math.max(maxLength, right-left);
    }
}
