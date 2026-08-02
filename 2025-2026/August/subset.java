class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        solve(nums,0,new ArrayList());
        return ans;
    }
    private void solve(int[] nums,int index,List<Integer> ds){
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        solve(nums,index+1,ds);
        ds.remove(ds.size() - 1);
        solve(nums,index+1,ds);
    }
}