import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(0, nums, new ArrayList<>());
        return ans;
    }

    private void solve(int index, int[] nums, List<Integer> ds) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);
        solve(index + 1, nums, ds);
        ds.remove(ds.size() - 1);

        int next = index + 1;
        while (next < nums.length && nums[next] == nums[index]) {
            next++;
        }

        solve(next, nums, ds);
    }
}