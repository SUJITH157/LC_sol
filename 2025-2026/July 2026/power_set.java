import java.util.*;

public class Power_Set {

    public static List<String> powerSet(String s) {

        List<String> ans = new ArrayList<>();

        solve(s, "", 0, ans);

        return ans;
    }

    public static void solve(String s, String current, int index, List<String> ans) {

        if (index == s.length()) {
            ans.add(current);
            return;
        }

        solve(s, current + s.charAt(index), index + 1, ans);

        solve(s, current, index + 1, ans);
    }

    public static void main(String[] args) {

        System.out.println(powerSet("abc"));

    }
}