public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> ans = new HashSet<>();
        ListNode temp = head;

        while(temp!= null){
            if(ans.contains(temp)){
                return true;

            }
            else{
                ans.add(temp);
                temp = temp.next;
            }
            
        }
        return false;
        
    }
}