class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0; // 초기 mode는 0

        for (int idx = 0; idx < code.length(); idx++) {
            char current = code.charAt(idx);

            if (current == '1') {
                // '1'을 만나면 mode 전환
                mode = 1 - mode; // 0 -> 1 또는 1 -> 0
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    // mode가 0일 때, idx가 짝수인 경우에만 추가
                    ret.append(current);
                } else if (mode == 1 && idx % 2 == 1) {
                    // mode가 1일 때, idx가 홀수인 경우에만 추가
                    ret.append(current);
                }
            }
        }

        // ret이 비어있으면 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
