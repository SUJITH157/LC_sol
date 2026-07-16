
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> ans = new HashSet<>();
        ListNode temp = head;

        while(temp!= null){
            if(ans.contains(temp)){
                
                return temp;

            }
            else{
                ans.add(temp);
                temp = temp.next;
            }
            
        }
        return null;
        
        
    }
}