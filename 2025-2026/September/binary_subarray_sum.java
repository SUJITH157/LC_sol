class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int left1 = 0;
        int left2 = 0;

        int sum1 = 0;
        int sum2 = 0;

        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            sum1 += nums[right];
            sum2 += nums[right];

            while (sum1 > goal) {
                sum1 -= nums[left1];
                left1++;
            }

            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }

            ans += left2 - left1;
        }

        return ans;
    }
}