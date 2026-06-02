import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;
        int maxFreq = 1;

        for (int i = 0; i < n; i++) {

            int remaining = k;
            int count = 1;

            for (int j = i - 1; j >= 0; j--) {

                int cost = nums[i] - nums[j];

                if (cost <= remaining) {
                    remaining -= cost;
                    count++;
                } else {
                    break;
                }
            }

            maxFreq = Math.max(maxFreq, count);
        }

        return maxFreq;
    }
}