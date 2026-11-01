
import java.util.*;

class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            while (!pq.isEmpty() && pq.peek() < intervals[i][0]) {
                pq.poll();
            }

            pq.add(intervals[i][1]);

            count = Math.max(count, pq.size());
        }

        return count;
    }
}
