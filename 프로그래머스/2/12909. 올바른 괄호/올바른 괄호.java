class Solution {
    boolean solution(String s) {
        int j = 0;
        
        String[] splitStr = s.split("");
        
        if(splitStr[0].equals(")")) {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(splitStr[i].equals("(")) {
                j++;
            } else {
                j--;
            }
            
            if(j < 0) {
                return false;
            }
        }

        return j == 0 ? true : false;
    }
}