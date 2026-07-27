import java.util.*;

class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        solve(digits, 0, "");

        return ans;
    }

    private String alphabets(char ch) {

        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {
            return "def";
        } else if (ch == '4') {
            return "ghi";
        } else if (ch == '5') {
            return "jkl";
        } else if (ch == '6') {
            return "mno";
        } else if (ch == '7') {
            return "pqrs";
        } else if (ch == '8') {
            return "tuv";
        } else {
            return "wxyz";
        }
    }

    private void solve(String digits, int index, String sol) {

        if (index == digits.length()) {
            ans.add(sol);
            return;
        }

        String letters = alphabets(digits.charAt(index));

        for (int i = 0; i < letters.length(); i++) {
            solve(digits, index + 1, sol + letters.charAt(i));
        }
    }
}