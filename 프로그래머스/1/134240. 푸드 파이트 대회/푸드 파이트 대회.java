class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            int repeat = food[i]/2;
            for (int j = 0; j < repeat; j++) {
                answer.append(i);
            }
        }
        answer.append(0);
        for(int i = food.length-1; i >= 1; i--) {
            int repeat = food[i]/2;
            for (int j = 0; j < repeat; j++) {
                answer.append(i);
            }
        }
        return answer.toString();
    }
}