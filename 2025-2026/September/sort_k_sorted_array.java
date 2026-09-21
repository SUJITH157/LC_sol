import java.util.*;

class Solution {
    
    public List<Integer> sortNearlySortedArray(List<Integer> arr, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= k && i < arr.size(); i++) {
            minHeap.add(arr.get(i));
        }

        for (int i = k + 1; i < arr.size(); i++) {
            result.add(minHeap.poll()); 
            minHeap.add(arr.get(i));    
        }

        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }
}

