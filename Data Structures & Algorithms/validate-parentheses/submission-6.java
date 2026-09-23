class Solution {
    public boolean isValid(String s) {
        Map<Character, Integer> openingBracket = Map.of(
            '(', 1,
            '{', 2,
            '[', 3
        );

        Map<Integer, Character> closingBracket = Map.of(
            1, ')',
            2, '}',
            3, ']'
        );

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (openingBracket.containsKey(letter)) {
                stack.push(letter);
            } else {
                if (!stack.isEmpty() && letter == closingBracket.get(openingBracket.get(stack.peek()))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
