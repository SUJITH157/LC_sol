class solutions {
    public int kthSmallest(int[] nums, int k) {
        priorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
        }
        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }
        return minHeap.poll();
    }

}
