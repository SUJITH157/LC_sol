class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> ans = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (ans.containsKey(c)) {

                if (t.charAt(i) != ans.get(c)) {
                    return false;
                }

            } else {

                ans.put(c, t.charAt(i));
            }
        }

        return true;
    }
}