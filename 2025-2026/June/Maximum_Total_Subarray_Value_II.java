import java.util.*;

class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int n = nums.length;

        SparseTable table = new SparseTable(nums);

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> b[0] - a[0]);

        long sum = 0;

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{
                table.query(i, n - 1),
                i,
                n - 1
            });
        }

        for (int i = 0; i < k; i++) {

            int[] current = pq.poll();

            int value = current[0];
            int left = current[1];
            int right = current[2];

            sum += value;

            if (left < right) {

                current[2] = right - 1;

                current[0] =
                    table.query(left, right - 1);

                pq.offer(current);
            }
        }

        return sum;
    }
}

class SparseTable {

    private final int[] log;
    private final int[][] maxTable;
    private final int[][] minTable;

    public SparseTable(int[] arr) {

        int n = arr.length;

        log = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int maxPower = log[n];

        maxTable = new int[maxPower + 1][n];
        minTable = new int[maxPower + 1][n];

        for (int i = 0; i < n; i++) {
            maxTable[0][i] = arr[i];
            minTable[0][i] = arr[i];
        }

        for (int p = 1; p <= maxPower; p++) {

            int len = 1 << p;
            int half = len >> 1;

            for (int i = 0; i + len <= n; i++) {

                maxTable[p][i] =
                    Math.max(
                        maxTable[p - 1][i],
                        maxTable[p - 1][i + half]
                    );

                minTable[p][i] =
                    Math.min(
                        minTable[p - 1][i],
                        minTable[p - 1][i + half]
                    );
            }
        }
    }

    public int query(int left, int right) {

        int p = log[right - left + 1];

        int maximum =
            Math.max(
                maxTable[p][left],
                maxTable[p][right - (1 << p) + 1]
            );

        int minimum =
            Math.min(
                minTable[p][left],
                minTable[p][right - (1 << p) + 1]
            );

        return maximum - minimum;
    }
}