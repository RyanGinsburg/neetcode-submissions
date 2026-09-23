class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                if (tokens[i].equals("+")) {
                    nums.push(num1+num2);
                } else if (tokens[i].equals("-")) {
                    nums.push(num2-num1);
                } else if (tokens[i].equals("*")) {
                    nums.push(num1*num2);
                } else {
                    nums.push(num2/num1);
                }
            } else {
                nums.push(Integer.parseInt(tokens[i]));
            }
        }
        return nums.peek();
    }
}
