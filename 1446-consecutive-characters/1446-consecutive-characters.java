class Solution {
    public int maxPower(String s) {
        int len = s.length();

        int curr = 1;
        int max = 1;
        
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == s.charAt(i- 1)) {
                curr++;
            } else {
                curr = 1;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}