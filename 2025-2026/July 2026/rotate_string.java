class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        int n = s.length();

        for (int start = 0; start < n; start++) {

            int j = 0;

            while (j < n && s.charAt((start + j) % n) == goal.charAt(j)) {
                j++;
            }

            if (j == n) {
                return true;
            }
        }

        return false;
    }
}
