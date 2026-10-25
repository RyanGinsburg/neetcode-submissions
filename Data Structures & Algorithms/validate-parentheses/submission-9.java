class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == '(' || letter == '{' || letter == '[') {
                stack.push(letter);
            } else {
                if (!stack.isEmpty() && letter == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (!stack.isEmpty() && letter == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (!stack.isEmpty() && letter == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
