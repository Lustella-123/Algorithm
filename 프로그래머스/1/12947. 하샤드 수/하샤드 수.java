class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int ori = x;
        while (x > 0) {
            sum = sum + (x % 10);
            x = x / 10;
        }
        if (ori%sum == 0) {
            return answer;
        } else {
            return !answer;
        }
    }
}