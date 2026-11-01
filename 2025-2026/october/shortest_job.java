
import java.util.*;

class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        int rows = Jobs.length;

        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));

        int maxDeadline = 0;

        for (int i = 0; i < rows; i++) {
            maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
        }

        maxDeadline = Math.min(maxDeadline, rows);

        boolean[] dead = new boolean[maxDeadline + 1];

        int sum = 0;
        int count = 0;

        int[] ans = new int[2];

        for (int i = 0; i < rows; i++) {
            for (int j = Math.min(Jobs[i][1], maxDeadline); j >= 1; j--) {
                if (!dead[j]) {
                    dead[j] = true;
                    sum += Jobs[i][2];
                    count++;
                    break;
                }
            }
        }

        ans[0] = count;
        ans[1] = sum;

        return ans;
    }
}
