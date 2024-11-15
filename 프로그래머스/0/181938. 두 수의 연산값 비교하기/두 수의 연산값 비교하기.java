class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String plus = Integer.toString(a) + Integer.toString(b);
        int pluss = Integer.parseInt(plus);
        int nopluss = 2 * a * b;
        if (pluss > nopluss) {
            answer = pluss;
        } else {
            answer = nopluss;
        }
        return answer;
    }
}