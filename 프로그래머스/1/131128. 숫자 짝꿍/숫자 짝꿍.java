import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 각 숫자의 빈도를 저장할 배열
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X와 Y에서 숫자 빈도를 계산
        for (char c : X.toCharArray()) countX[c - '0']++;
        for (char c : Y.toCharArray()) countY[c - '0']++;

        // 공통된 숫자를 큰 숫자부터 조합
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]); // 공통된 숫자의 개수
            result.append(String.valueOf(i).repeat(commonCount)); // 숫자를 반복해서 추가
        }

        // 결과가 비어 있으면 "-1" 반환
        if (result.length() == 0) return "-1";

        // 결과가 0으로만 구성되면 "0" 반환
        if (result.charAt(0) == '0') return "0";

        return result.toString();
    }
}
