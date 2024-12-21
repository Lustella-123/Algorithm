class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        //strArr만큼 반복
        for (int i = 0; i < strArr.length; i++) {
            //홀수 -> 대문자
            if (i % 2 != 0) {
                answer[i] = strArr[i].toUpperCase();
            }        
            //짝수 -> 소문자
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}