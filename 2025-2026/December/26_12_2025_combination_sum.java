import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        findCombinations(candidates, target, 0, temp, result);
        return result;
    }

    private void findCombinations(int[] candidates, int target, int i,
                                  List<Integer> temp,
                                  List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        
        if (target < 0) {
            return;
        }

       
        for (int index = i; index < candidates.length; index++) {
            temp.add(candidates[index]);   
            findCombinations(candidates, target - candidates[index],
                             index, temp, result); 
            temp.remove(temp.size() - 1);  
        }
    }
}

