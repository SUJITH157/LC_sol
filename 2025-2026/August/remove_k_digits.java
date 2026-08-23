import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Integer> st = new Stack<>();

        if (k == num.length()) {
            return "0";
        }

        for (int i = 0; i < num.length(); i++) {

            int digit = num.charAt(i) - '0';

            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        ans.reverse();

        int i = 0;

        while (i < ans.length() - 1 && ans.charAt(i) == '0') {
            i++;
        }

        return ans.substring(i);
    }
}