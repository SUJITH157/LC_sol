class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        int k = lists.length;

        if (k == 0) {
            return null;
        }

        ListNode[] heap = new ListNode[k];
        int size = 0;

        for (int i = 0; i < k; i++) {
            if (lists[i] != null) {
                heap[size] = lists[i];
                size++;
            }
        }

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapifyDown(heap, size, i);
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (size > 0) {

            ListNode smallest = heap[0];

            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {

                heap[0] = smallest.next;

                heapifyDown(heap, size, 0);

            } else {

                heap[0] = heap[size - 1];
                size--;

                if (size > 0) {
                    heapifyDown(heap, size, 0);
                }
            }
        }

        return dummy.next;
    }

    public void heapifyDown(ListNode[] heap, int size, int i) {

        while (true) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int smallest = i;

            if (left < size && heap[left].val < heap[smallest].val) {
                smallest = left;
            }

            if (right < size && heap[right].val < heap[smallest].val) {
                smallest = right;
            }

            if (smallest == i) {
                break;
            }

            ListNode temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;

            i = smallest;
        }
    }
}