import java.util.Arrays;

class solution{
    public int minTracks(int[][] intervals){
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        priorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!pq.isEmpty() && pq.peek() <= intervals[i][0]){
                pq.poll();
            }
            pq.add(intervals[i][1]);

            count = Math.max(count, pq.size());
        }
        return count;
    }
}