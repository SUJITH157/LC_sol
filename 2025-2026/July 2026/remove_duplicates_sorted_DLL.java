class Solution {

    Node removeDuplicates(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {

                Node duplicate = temp.next;

                temp.next = duplicate.next;

                if (duplicate.next != null) {
                    duplicate.next.prev = temp;
                }
            }
            else {
                temp = temp.next;
            }
        }

        return head;
    }
}