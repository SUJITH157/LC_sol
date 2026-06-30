class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;
        int ans = 0;

        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        while (low <= high) {

            int mid = (low + high) / 2;
            int day = 1;
            int sum = 0;

            for (int i = 0; i < weights.length; i++) {

                if (sum + weights[i] <= mid) {
                    sum += weights[i];
                }

                else {
                    day++;
                    sum = weights[i];
                }
            }

            if (day <= days) {
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}