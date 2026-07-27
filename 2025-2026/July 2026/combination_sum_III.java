class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        solve(1, 0, k, n, new ArrayList<>());

        return ans;
    }

    private void solve(int start, int sum, int limit, int target, List<Integer> ds) {

        if (ds.size() == limit) {
            if (sum == target) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (start > 9) {
            return;
        }

        ds.add(start);
        solve(start + 1, sum + start, limit, target, ds);
        ds.remove(ds.size() - 1);

        solve(start + 1, sum, limit, target, ds);
    }
}