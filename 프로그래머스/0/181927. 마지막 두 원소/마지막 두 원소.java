class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l + 1];
        int last = 0;
        if (num_list[l-1] > num_list[l-2]) {
            last = num_list[l-1] - num_list[l-2];
        } else {
            last = num_list[l-1] * 2;
        }
        int a = 0;
        for(int n : num_list) {
            answer[a] = n;
            a++;
        }
        answer[l] = last;
        return answer;
    }
}