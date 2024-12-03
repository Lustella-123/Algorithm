class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    for (int l = 2; l <= Math.sqrt(sum); l++) {
                        if (sum % l == 0) { // 소수가 아님
                            sum = 0; // sum을 0으로 설정하여 소수가 아님을 표시
                            break;
                        }
                    }
                    if (sum != 0) { // 소수일 경우
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
