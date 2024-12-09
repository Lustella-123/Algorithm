import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 체육복 보유 상태를 나타낼 배열
        int[] students = new int[n];
        Arrays.fill(students, 1); // 모든 학생이 기본적으로 체육복 1벌을 가지고 있다고 가정
        
        // 도난당한 학생 체육복 -1
        for (int l : lost) {
            students[l - 1]--;
        }
        
        // 여벌 체육복이 있는 학생 체육복 +1
        for (int r : reserve) {
            students[r - 1]++;
        }
        
        // 체육복 빌려주기 로직
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) { // 체육복이 없는 경우
                if (i > 0 && students[i - 1] == 2) { // 앞번호 학생에게 빌림
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 2) { // 뒷번호 학생에게 빌림
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        
        // 체육 수업에 참여 가능한 학생 수 계산
        int answer = 0;
        for (int s : students) {
            if (s > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
