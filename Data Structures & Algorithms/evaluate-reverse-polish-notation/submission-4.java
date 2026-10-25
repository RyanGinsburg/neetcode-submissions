class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if (token.equals("+")) {
                    stack.push(num1+num2);
                } else if (token.equals("-")) {
                    stack.push(num1 - num2);
                } else if (token.equals("*")) {
                    stack.push(num1*num2);
                } else {
                    stack.push(num1/num2);
                }
            } else { //num input
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
