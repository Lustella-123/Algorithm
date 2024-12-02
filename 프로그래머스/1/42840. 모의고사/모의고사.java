import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자의 찍는 방식
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 점수 저장용 배열
        int[] scores = new int[3];

        // 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) scores[0]++;
            if (answers[i] == two[i % two.length]) scores[1]++;
            if (answers[i] == three[i % three.length]) scores[2]++;
        }

        // 최고 점수 계산
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 받은 사람 찾기
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1); // 수포자 번호는 1부터 시작
            }
        }

        // 결과를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
