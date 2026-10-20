
import java.util.*;

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        int n = val.length;

        double[][] items = new double[n][3];

        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
            items[i][2] = (double) val[i] / wt[i];
        }

        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));

        double ans = 0.0;

        for (int i = 0; i < n; i++) {
            if (cap >= items[i][1]) {
                ans += items[i][0];
                cap -= (long) items[i][1];
            } else {
                ans += items[i][2] * cap;
                break;
            }
        }

        return Math.round(ans * 1000000.0) / 1000000.0;
    }
}
