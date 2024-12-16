class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int n = 0; n < queries.length; n++) {
            int i = queries[n][0];
            int j = queries[n][1];
            int iValue = arr[i];
            int jValue = arr[j];
            arr[i] = jValue;
            arr[j] = iValue;
        }
        return arr;
    }
}