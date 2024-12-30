class Solution {
    public int solution(int[] num_list) {
        int oddIndexSum = 0;
        int evenIndexSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 1) {
                oddIndexSum += num_list[i];
            } else {
                evenIndexSum += num_list[i];
            }
        }

        return Math.max(oddIndexSum, evenIndexSum);
    }
}
