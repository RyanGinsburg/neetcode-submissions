class Solution {

    public String encode(List<String> strs) {
        String message = "";
        for (String word : strs) {
            message += word.length() + "#" + word;
        }
        return message;
    }

    public List<String> decode(String str) {
        List<String> message = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String num = "";
            while (str.charAt(i) != '#') {
                num += str.charAt(i);
                i++;
            }
            int length = Integer.parseInt(num);
            message.add(str.substring(i+1, i+1+length));
            i+=length;
        }
        return message;
    }
}
