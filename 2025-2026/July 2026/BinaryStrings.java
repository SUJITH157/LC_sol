import java.util.*;

public class BinaryStrings {

    public static ArrayList<String> generateBinaryStrings(int n) {

        ArrayList<String> ans = new ArrayList<>();

        solve(n, "", ans);

        return ans;
    }

    public static void solve(int n, String current, ArrayList<String> ans) {

        if (current.length() == n) {
            ans.add(current);
            return;
        }

        solve(n, current + "0", ans);

        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            solve(n, current + "1", ans);
        }
    }

}