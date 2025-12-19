class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int m = len / 2;
        int[] ans = new int[len];

        int j = 0;       
        int k = m;          

        for (int i = 0; i < len; i += 2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[k];
            j++;
            k++;
        }

        return ans;
    }
}

