class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sum = 0;
        for(int n : num_list) {
            multiply *= n;
        }
        for(int n : num_list) {
            sum += n;
        }
        sum = sum * sum;
        return multiply < sum ? 1 : 0;
    }
}