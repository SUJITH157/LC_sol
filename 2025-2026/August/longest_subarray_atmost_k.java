import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> table = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            int a = nums[right];

            table.put(a, table.getOrDefault(a, 0) + 1);

            while (table.get(a) > k) {
                int b = nums[left];
                table.put(b, table.get(b) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}