class Solution {

    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        String mid = "";

        for (int i = 0; i < 26; i++) {

            int half = freq[i] / 2;

            for (int j = 0; j < half; j++) {
                left.append((char) (i + 'a'));
                right.insert(0, (char) (i + 'a'));
            }

            if (freq[i] % 2 == 1) {
                mid = String.valueOf((char) (i + 'a'));
            }
        }

        return left.toString() + mid + right.toString();
    }
}