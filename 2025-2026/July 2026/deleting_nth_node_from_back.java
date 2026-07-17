class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        
        int pos = size - n + 1;

        
        if (pos == 1) {
            return head.next;
        }

        temp = head;

        
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        
        temp.next = temp.next.next;

        return head;
    }
}