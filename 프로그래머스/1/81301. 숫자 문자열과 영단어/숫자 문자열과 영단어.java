class Solution {
    public int solution(String s) {
        // 숫자와 해당 영단어 매핑
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 문자열에서 영단어를 숫자로 대체
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }
        
        // 변환된 문자열을 정수로 변환
        return Integer.parseInt(s);
    }
}
