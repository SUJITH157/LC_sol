class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[]{-1, -1};

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = i;   
                }
                result[1] = i;       
            }
        }

        return result;
    }
}

