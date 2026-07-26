import java.util.*;

class Solution {

    public static int countSubsequenceK(int[] arr, int target) {
        return solve(0, 0, arr, target);
    }

    public static int solve(int index, int sum,int[] arr,int target) {

        if (index == arr.length) {
            return (sum == target) ? 1 : 0;
        }

        int pick = solve(index + 1,sum + arr[index],arr,target);

        int notPick = solve(index + 1,sum,arr,target);

        return pick + notPick;
    }
}