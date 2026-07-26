import java.util.*;

class Solution {

    static int count = 0;

    public static int countSubsequenceK(int[] arr, int target) {

        count = 0;

        solve(0, 0, arr, target, new ArrayList<>());

        return count;
    }

    public static void solve(int index, int sum,int[] arr,int target,ArrayList<Integer> ds) {

        if (index == arr.length) {
            if (sum == target) {
                count++;
            }
            return;
        }

        ds.add(arr[index]);
        solve(index + 1, sum + arr[index], arr, target, ds);

        ds.remove(ds.size() - 1);

        solve(index + 1, sum, arr, target, ds);
    }
}