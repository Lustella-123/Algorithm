class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //50이상, 짝수
            if (arr[i] % 2 == 0 && arr[i] >= 50) {
                arr[i] = arr[i] / 2;
            }
            //50미만, 홀수
            else if (arr[i] % 2 != 0 && arr[i] < 50) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
}