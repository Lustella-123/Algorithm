class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = -1; // 마지막으로 칠한 구역의 끝
        
        for (int s : section) {
            if (s > lastPainted) { // 현재 구역이 칠해지지 않았다면
                answer++; // 롤러 사용 횟수 증가
                lastPainted = s + m - 1; // 현재 구역부터 롤러 범위 설정
            }
        }
        
        return answer;
    }
}
