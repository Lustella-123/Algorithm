class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통 분모와 더한 분자 계산
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;
        
        // 기약분수로 만들기 위해 최대공약수를 구함
        int gcd = gcd(numerator, denominator);
        
        // 최대공약수로 분자와 분모를 나누어 기약분수로 변환
        return new int[] {numerator / gcd, denominator / gcd};
    }

    // 최대공약수를 구하는 메소드 (유클리드 호제법)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b); // 재귀적으로 GCD를 구함
    }
}
