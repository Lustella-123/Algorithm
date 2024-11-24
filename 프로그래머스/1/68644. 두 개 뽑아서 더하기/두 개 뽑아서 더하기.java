import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 두 숫자의 합을 저장할 배열 크기 계산
        int[] temp = new int[numbers.length * (numbers.length - 1) / 2];
        int idx = 0;

        // 두 수의 합 계산
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[idx++] = numbers[i] + numbers[j];
            }
        }

        // 중복 제거 및 정렬
        int[] result = Arrays.stream(temp).distinct().sorted().toArray();

        return result;
    }
}
