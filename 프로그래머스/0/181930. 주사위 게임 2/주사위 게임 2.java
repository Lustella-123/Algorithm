class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int sumOfSquares = a * a + b * b + c * c;
        int sumOfCubes = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            answer = sum * sumOfSquares * sumOfCubes;
        } else if (a == b || a == c || b == c) {
            answer = sum * sumOfSquares;
        } else {
            answer = sum;
        }

        return answer;
    }
}
