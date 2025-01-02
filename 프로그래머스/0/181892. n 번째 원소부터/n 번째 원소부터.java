class Solution {
    public int[] solution(int[] num_list, int n) {
        // num_list의 길이에서 n-1부터 끝까지 부분 배열 생성
        int[] answer = new int[num_list.length - n + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n - 1 + i];
        }
        return answer;
    }
}