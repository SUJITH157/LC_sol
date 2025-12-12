class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[]{}; 
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 3;
        int[] result = sol.twoSum(nums, target);
        
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found");
        }
    }
}
