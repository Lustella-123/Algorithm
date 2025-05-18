class Solution {
    public int solution(int n) {
        int bitCnt = Integer.bitCount(n);
        
        while (true) {
            n++;
            if (Integer.bitCount(n) == bitCnt) {
                return n;
            }
        }
    }
}