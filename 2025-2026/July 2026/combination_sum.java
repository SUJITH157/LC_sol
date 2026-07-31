class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        solve(candidates, target, 0, 0, new ArrayList<>());

        return ans;
    }

    public void solve(int[] candidates, int target, int index,
                      int sum, ArrayList<Integer> list) {

        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (sum > target || index == candidates.length) {
            return;
        }

        list.add(candidates[index]);
        solve(candidates, target, index,
              sum + candidates[index], list);

        list.remove(list.size() - 1);

        solve(candidates, target, index + 1,
              sum, list);
    }
}