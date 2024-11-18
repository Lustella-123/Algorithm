class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pValue = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            long substringValue = Long.parseLong(substring);

            if (substringValue <= pValue) {
                answer++;
            }
        }
        return answer;
    }
}
