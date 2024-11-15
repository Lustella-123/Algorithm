class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        for(int i = length - 1; i >= 0; i--) {
            answer[i] += num_list[length - i - 1];
        }
        return answer;
    }
}