class Solution {
    public int solution(int n) {
        int p = 0;
        int n1 = 0;
        int n2 = 1;
        
        for(int i = 1; i < n; i++) {
            p = (n1 + n2) % 1234567;
            n1 = n2;
            n2 = p;
        }
        
        return p;
    }
}