class Solution {
    public String solution(String myString) {
        String lowString = myString.toLowerCase();
        String answer = lowString.replace("a", "A");
        return answer;
    }
}