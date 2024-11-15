import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int center = (array.length - 1) / 2;
        
        // 배열 정렬
        Arrays.sort(array);
        
        // 중앙값 추출
        answer = array[center];
        
        return answer;
    }
}