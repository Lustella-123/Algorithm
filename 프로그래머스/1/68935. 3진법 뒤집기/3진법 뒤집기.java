class Solution {
    public int solution(int n) {
        int answer = 0;
        // n (3진법)
        String three = Integer.toString(n, 3);
        // 앞뒤 반전(3진법)
        String reverse = "";
        for (int i = three.length() - 1; i >= 0; i--) {
            reverse += three.charAt(i);
        }
        // 10진법으로 표현
        answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}
