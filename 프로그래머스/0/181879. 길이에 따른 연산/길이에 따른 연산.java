import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        //리스트 10 초과
        if (num_list.length > 10) {
            answer = Arrays.stream(num_list).sum();
        }
        //리스트 10 이하
        else {
            answer = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        }
        return answer;
    }
}