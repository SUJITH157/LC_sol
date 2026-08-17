class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }

        if (xor != 0) {
            return n;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return n - 1;
            }
        }

        return 0;
    }
}