class Solution {
    public double minimiseMaxDistance(int[] arr, int k) {

        double low = 0;
        double high = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        while (high - low > 1e-6) {

            double mid = (low + high) / 2.0;
            int count = 0;

            for (int i = 0; i < arr.length - 1; i++) {

                double gap = arr[i + 1] - arr[i];
                count += (int)(gap / mid);

                if (gap == mid * (int)(gap / mid)) {
                    count--;
                }
            }

            if (count > k) {
                low = mid;
            }

            else {
                high = mid;
            }
        }

        return high;
    }
}