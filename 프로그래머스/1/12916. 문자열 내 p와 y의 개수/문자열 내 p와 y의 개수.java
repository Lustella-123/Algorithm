class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if (c == 'p') {
                p++;
            } else if (c == 'y') {
                y++;
            }
        }

        if (p != y) {
            return false;
        }

        return true;
    }
}