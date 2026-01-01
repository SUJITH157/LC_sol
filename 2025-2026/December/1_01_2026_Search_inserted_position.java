class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] >= target) {
                return i;  
            }
            i++;
        }

        
        return n;
    }
}