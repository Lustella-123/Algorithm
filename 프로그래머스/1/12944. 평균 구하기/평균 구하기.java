class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (double arrs : arr)
            answer += arrs;
        return answer / arr.length;
    }
}