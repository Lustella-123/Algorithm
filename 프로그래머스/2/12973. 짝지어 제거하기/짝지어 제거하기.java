class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // 짝 제거
            } else {
                sb.append(c); // 추가
            }
        }

        return sb.length() == 0 ? 1 : 0;
    }
}
