import java.util.HashSet;

class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> ans = new HashSet<>();

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);

            int num = nums[i];

            if (ans.contains(num)) {
                continue;
            } else {
                ans.add(num);
            }
        }

        int i = k;

        while (i <= max) {
            if (ans.contains(i)) {
                i = i + k;
            } else {
                return i;
            }
        }

        return i;
    }
}