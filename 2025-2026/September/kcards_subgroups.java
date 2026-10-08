import java.util.HashMap;

class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {

        int n = hand.length;

        if (n % groupSize != 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

      
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(hand, n, i);
        }

        int heapSize = n;

        while (heapSize > 0) {

            
            while (heapSize > 0 && map.get(hand[0]) == 0) {

                hand[0] = hand[heapSize - 1];
                heapSize--;

                if (heapSize > 0) {
                    heapify(hand, heapSize, 0);
                }
            }

            if (heapSize == 0) {
                break;
            }

            
            int start = hand[0];

           
            for (int i = 0; i < groupSize; i++) {

                int value = start + i;

                if (!map.containsKey(value) || map.get(value) == 0) {
                    return false;
                }

                map.put(value, map.get(value) - 1);
            }
        }

        return true;
    }

    public void heapify(int[] hand, int n, int i) {

        while (true) {

            int smallest = i;

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && hand[left] < hand[smallest]) {
                smallest = left;
            }

            if (right < n && hand[right] < hand[smallest]) {
                smallest = right;
            }

            if (smallest == i) {
                break;
            }

            int temp = hand[i];
            hand[i] = hand[smallest];
            hand[smallest] = temp;

            i = smallest;
        }
    }
}