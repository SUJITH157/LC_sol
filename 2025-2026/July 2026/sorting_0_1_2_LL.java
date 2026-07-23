class Solution {

    static Node segregate(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        while (temp != null) {

            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }

            temp = temp.next;
        }

        

        if (oneHead.next != null) {
            zero.next = oneHead.next;
        } else {
            zero.next = twoHead.next;
        }

        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }
}