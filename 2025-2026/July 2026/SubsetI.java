import java.util.*;

public class SubsetI {

    static ArrayList<Integer> ans = new ArrayList<>();

    public static ArrayList<Integer> subset(int[] arr) {

        solve(0, 0, arr);

        Collections.sort(ans);

        return ans;
    }

    static void solve(int index, int sum, int[] arr) {

        if (index == arr.length) {
            ans.add(sum);
            return;
        }

        solve(index + 1, sum + arr[index], arr);

        solve(index + 1, sum, arr);
    }
}