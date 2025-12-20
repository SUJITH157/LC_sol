class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int [] result = new int[2];
        int i = 0;
        int j = i +1;
        for(i=0;i<n;i++){
            if(nums[i] == nums [j]){
                result[0] = nums[i];
                result[1] = nums[i]+1;
            }
        }
        return result;
        
    }
}