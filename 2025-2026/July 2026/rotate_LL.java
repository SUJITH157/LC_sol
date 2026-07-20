class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int size = 1;

        while (temp.next != null) {
            temp = temp.next;
            size++;
        }

        k = k % size;

        if (k == 0) {
            return head;
        }

        temp.next = head;

        int steps = size - k;

        ListNode newLast = head;

        for (int i = 1; i < steps; i++) {
            newLast = newLast.next;
        }

        ListNode newHead = newLast.next;

        newLast.next = null;

        return newHead;
        
    }
}