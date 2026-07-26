class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  
        solve(0, candidates, target, new ArrayList<>());
        return ans;
    }

    private void solve(int index, int[] candidates, int target, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue; 
            }

            if (candidates[i] > target) {
                break; 
            }

            ds.add(candidates[i]);
            solve(i + 1, candidates, target - candidates[i], ds); 
            ds.remove(ds.size() - 1);
        }
    }
}