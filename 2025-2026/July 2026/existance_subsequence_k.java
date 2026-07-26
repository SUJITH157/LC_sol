class Solution {

    public static boolean checkSubsequenceK(int[] arr, int target) {
        return solve(0, 0, arr, target);
    }

    public static boolean solve(int index, int sum, int[] arr, int target) {

        if (index == arr.length) {
            if (sum == target) {
                return true;
            } else {
                return false;
            }
        }

        boolean pick = solve(index + 1, sum + arr[index], arr, target);

        if (pick == true) {
            return true;
        }

        boolean notPick = solve(index + 1, sum, arr, target);

        if (notPick == true) {
            return true;
        }

        return false;
    }
}