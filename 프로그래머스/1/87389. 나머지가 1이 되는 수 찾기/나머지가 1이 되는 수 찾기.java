class Solution {
    public int solution(int n) {
        int answer = n;
        for (int x = 1; x <= n; x++) {
            if (n % x == 1) {
                if (answer >= x) {
                answer = x;
                }
            }
        }
        return answer;
    }
}