class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; // 결과 배열

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); // 현재 문자
            int closestDistance = -1; // 초기값 -1

            // i 이전의 모든 위치 탐색
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(j) == currentChar) {
                    closestDistance = i - j; // 현재 위치와의 거리
                    break; // 가장 가까운 거리만 찾으면 종료
                }
            }

            answer[i] = closestDistance; // 결과 저장
        }

        return answer;
    }
}
