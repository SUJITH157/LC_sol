class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<long[]> maxStack = new Stack<>();
        Stack<long[]> minStack = new Stack<>();

        long maxSum = 0;
        long minSum = 0;
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {

            long count = 1;

            while (!maxStack.isEmpty() && maxStack.peek()[0] <= nums[i]) {
                long[] temp = maxStack.pop();
                maxSum -= temp[0] * temp[1];
                count += temp[1];
            }

            maxStack.push(new long[]{nums[i], count});
            maxSum += (long) nums[i] * count;


            count = 1;

            while (!minStack.isEmpty() && minStack.peek()[0] >= nums[i]) {
                long[] temp = minStack.pop();
                minSum -= temp[0] * temp[1];
                count += temp[1];
            }

            minStack.push(new long[]{nums[i], count});
            minSum += (long) nums[i] * count;

            ans += maxSum - minSum;
        }

        return ans;
    }
}