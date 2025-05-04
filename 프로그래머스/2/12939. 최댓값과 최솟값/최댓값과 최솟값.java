import java.util.*;

class Solution {
    public String solution(String s) {

        String[] strArr = s.split(" ");

        int[] numbers = Arrays.stream(strArr)
                              .mapToInt(Integer::parseInt)
                              .toArray();

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        return min + " " + max;
    }
}
