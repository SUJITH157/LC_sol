import java.util.Stack;

class solution{
    public int[] nextgreaterElement(int[] nums){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.size();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}