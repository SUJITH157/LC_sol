import java.util.PriorityQueue;

class Solution {
    public int connectSticks(List<Integer> sticks) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < sticks.size(); i++) {
            minHeap.add(sticks.get(i));
        }

        int cost = 0;

        while (minHeap.size() > 1) {

            int first = minHeap.poll();
            int second = minHeap.poll();

            int sum = first + second;

            cost += sum;

            minHeap.add(sum);
        }

        return cost;
    }
}