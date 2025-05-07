class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean isStart = true;

        for (char c : s.toCharArray()) {
            if (isStart) {
                result.append(Character.isLetter(c) ? Character.toUpperCase(c) : c);
                isStart = false;
            } else {
                result.append(Character.isLetter(c) ? Character.toLowerCase(c) : c);
            }
            if (c == ' ') {
                isStart = true;
            }
        }

        return result.toString();
    }
}
