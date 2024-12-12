import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            String m = my_string.charAt(i) + "";
            if (!m.equals(letter)) {
                answer.append(m);
            }
        }
        return answer.toString();
    }
}