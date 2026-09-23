class Solution {

    public String encode(List<String> strs) {
        StringBuilder message = new StringBuilder();

        for (String word : strs) {
            message.append(word.length())
                   .append('#')
                   .append(word);
        }

        return message.toString();
    }

    public List<String> decode(String str) {
        List<String> message = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            int end = start + length;

            message.add(str.substring(start, end));

            i = end;
        }

        return message;
    }
}