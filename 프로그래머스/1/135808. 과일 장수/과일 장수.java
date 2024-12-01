import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 점수 배열을 내림차순 정렬
        Arrays.sort(score);
        int n = score.length;

        // 뒤에서부터 상자를 구성
        for (int i = n - m; i >= 0; i -= m) {
            // 현재 상자의 최저 점수는 배열에서 i번째 값
            answer += score[i] * m;
        }

        return answer;
    }
}
