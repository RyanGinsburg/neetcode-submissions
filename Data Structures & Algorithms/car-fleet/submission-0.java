class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<int[]> cars = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            cars.add(new int[]{position[i], speed[i]});
        }
        cars.sort((a, b) -> b[0] - a[0]);

        Stack<Double> times = new Stack<>();

        for (int i = 0; i < position.length; i++) {
            double time = (double)(target-cars.get(i)[0])/cars.get(i)[1];
            if (times.isEmpty() || times.peek() < time) {
                times.push(time);
            }
        }
        return times.size();
    }
}
