class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            
            int min = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                    found = true;
                }
            }

            answer[j] = found ? min : -1;
        }

        return answer;
    }
}
