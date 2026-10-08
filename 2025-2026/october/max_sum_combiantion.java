import java.util.*;

class Solution {
    public int[] maxSumCombinations(int[] nums1, int[] nums2, int k) {

        int n = nums1.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] ans = new int[k];

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        HashSet<Long> visited = new HashSet<>();

        int i = n - 1;
        int j = n - 1;

        maxHeap.add(new int[]{nums1[i] + nums2[j], i, j});

        long key = (long) i * n + j;
        visited.add(key);

        for (int x = 0; x < k; x++) {

            int[] current = maxHeap.poll();

            int sum = current[0];
            i = current[1];
            j = current[2];

            ans[x] = sum;

            if (i - 1 >= 0) {

                long newKey = (long) (i - 1) * n + j;

                if (!visited.contains(newKey)) {

                    maxHeap.add(new int[]{
                        nums1[i - 1] + nums2[j],
                        i - 1,
                        j
                    });

                    visited.add(newKey);
                }
            }

            if (j - 1 >= 0) {

                long newKey = (long) i * n + (j - 1);

                if (!visited.contains(newKey)) {

                    maxHeap.add(new int[]{
                        nums1[i] + nums2[j - 1],
                        i,
                        j - 1
                    });

                    visited.add(newKey);
                }
            }
        }

        return ans;
    }
}