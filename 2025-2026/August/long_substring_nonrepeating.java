import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            int count = 0;
            HashMap<Character, Integer> a = new HashMap<>();

            int j = i;

            while (j < s.length()) {

                char ans = s.charAt(j);

                if (a.containsKey(ans)) {
                    break;
                } else {
                    count++;
                    a.put(ans, 1);
                }

                j++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}