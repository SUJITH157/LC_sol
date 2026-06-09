class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        long value = (long)(max - min);

        return value * k;
    }
}