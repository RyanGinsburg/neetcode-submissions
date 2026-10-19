class Solution {
    public int maxDifference(String s) {
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (int frequency : map.values()) {
            if (frequency % 2 == 0 && frequency < minEven) {
                minEven = frequency;
            } else if (frequency % 2 != 0 && frequency > maxOdd) {
                maxOdd = frequency;
            }
        }
        return maxOdd - minEven;
    }
}