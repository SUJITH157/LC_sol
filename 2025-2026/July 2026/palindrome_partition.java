class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {

        solve(0, s, new ArrayList<>());

        return ans;
    }

    private void solve(int index, String s, List<String> ds) {

        if (index == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s, index, i)) {

                ds.add(s.substring(index, i + 1));

                solve(i + 1, s, ds);

                ds.remove(ds.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}