class Solution {

    static Node deleteAllOccurOfX(Node head, int x) {

        Node temp = head;

        while (temp != null) {

            Node next = temp.next;

            if (temp.data == x) {

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }

            temp = next;
        }

        return head;
    }
}