class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(0, digits, map, new StringBuilder());

        return ans;
    }

    private void solve(int index, String digits,
                       String[] map, StringBuilder ds) {

        if (index == digits.length()) {
            ans.add(ds.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            ds.append(letters.charAt(i));

            solve(index + 1, digits, map, ds);

            ds.deleteCharAt(ds.length() - 1);
        }
    }
}