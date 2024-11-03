class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        String star = "";
        for(int i = 1; i <= phone_number.length() - 4; i++) {
            star += "*";
        }
        answer.replace(0,phone_number.length() - 4,star);
        return answer.toString();
    }
}