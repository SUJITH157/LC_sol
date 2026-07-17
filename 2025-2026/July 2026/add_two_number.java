class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        
        int len1 = 0, len2 = 0;

        ListNode t1 = l1;
        ListNode t2 = l2;

        while (t1 != null) {
            len1++;
            t1 = t1.next;
        }

        while (t2 != null) {
            len2++;
            t2 = t2.next;
        }

        
        ListNode longer, shorter;

        if (len1 >= len2) {
            longer = l1;
            shorter = l2;
        } else {
            longer = l2;
            shorter = l1;
        }

        ListNode tempLong = longer;
        ListNode tempShort = shorter;

        int carry = 0;
        ListNode prev = null;

        while (tempLong != null) {

            int sum = tempLong.val + carry;

            if (tempShort != null) {
                sum += tempShort.val;
                tempShort = tempShort.next;
            }

            tempLong.val = sum % 10;
            carry = sum / 10;

            prev = tempLong;
            tempLong = tempLong.next;
        }

        
        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        return longer;
    }
}