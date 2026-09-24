class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int days = 0;
            int temp = temperatures[i];
            for (int j = i+1; j<temperatures.length; j++) {
                days++;
                if (temperatures[j] > temp) {
                    result[i] = days;
                    break;
                } else {
                    result[i] = 0;
                }
            }
        }
        return result;
    }
}
