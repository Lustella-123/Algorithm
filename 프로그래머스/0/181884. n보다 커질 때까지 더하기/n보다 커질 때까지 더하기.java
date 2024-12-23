class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int num = 0;
        while (answer <= n) {
            answer += numbers[num];
            num++;
        }
        return answer;
    }
}