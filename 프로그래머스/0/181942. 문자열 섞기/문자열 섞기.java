class Solution {
    public String solution(String str1, String str2) {
        
        String answer = "";
        int sl1 = str1.length();
        int sl2 = str2.length();
        int one = 0;
        int two = 0;
        
        for(int i = 1; i <= sl1+sl2; i++) {
            if(i%2 == 0) {
                answer += str2.charAt(two);
                two++;
            } else {
                answer += str1.charAt(one);
                one++;
            }
        }
        return answer;
    }
}