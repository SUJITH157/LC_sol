public class previous_smaller_number {
    public int[] previousSmaller(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<n;i++){
            while(!st.isEmpty() && st.peek() >= nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }else{
                ans[i] = -1;
            }
            st.push(nums[i]);
        }
        return ans;
    }
    
}
