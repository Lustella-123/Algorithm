class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int one = 0;
        int two = 0;
        for(String g : goal) {
            if(one < cards1.length && cards1[one].equals(g)) {
                one++;
            } else if(two < cards2.length && cards2[two].equals(g)) {
                two++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}