import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> tsub = new HashMap<>();
        HashMap<Character, Integer> ssub = new HashMap<>();

        int left = 0;
        int count = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int i = 0; i < t.length(); i++) {
            char te = t.charAt(i);
            tsub.put(te, tsub.getOrDefault(te, 0) + 1);
        }

        for (int right = 0; right < s.length(); right++) {

            char value = s.charAt(right);

            if (tsub.containsKey(value)) {

                ssub.put(value, ssub.getOrDefault(value, 0) + 1);

                if (ssub.get(value) <= tsub.get(value)) {
                    count++;
                }
            }

            while (count == t.length()) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftValue = s.charAt(left);

                if (tsub.containsKey(leftValue)) {

                    ssub.put(leftValue, ssub.get(leftValue) - 1);

                    if (ssub.get(leftValue) < tsub.get(leftValue)) {
                        count--;
                    }
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}