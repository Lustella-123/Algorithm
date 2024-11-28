import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 명예의 전당 점수를 저장할 우선순위 큐 (오름차순 정렬)
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        // 매일 발표되는 최하위 점수를 저장할 리스트
        List<Integer> dailyMinScores = new ArrayList<>();
        
        for (int s : score) {
            // 명예의 전당에 점수 추가
            hallOfFame.offer(s);
            
            // 명예의 전당의 크기가 k를 초과하면 가장 낮은 점수를 제거
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }
            
            // 현재 명예의 전당에서 최하위 점수를 기록
            dailyMinScores.add(hallOfFame.peek());
        }
        
        // 리스트를 배열로 변환하여 반환
        return dailyMinScores.stream().mapToInt(Integer::intValue).toArray();
    }
}
