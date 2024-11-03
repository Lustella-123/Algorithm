class Solution {
    public long solution(long n) {
        for (long x = 1; x <= Math.sqrt(n); x++) {
            if(x*x == n) {
                return (x+1)*(x+1);
            }
        } return -1;
    }
}