import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;

        answer[index++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}
