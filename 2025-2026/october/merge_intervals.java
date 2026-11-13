import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> merge(List<List<Integer>> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        Collections.sort(intervals, (a, b) -> Integer.compare(a.get(0), b.get(0)));

        List<List<Integer>> merged = new ArrayList<>();

        for (List<Integer> interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval.get(0)) {
                merged.add(new ArrayList<>(interval));
            } else {
                int currentEnd = merged.get(merged.size() - 1).get(1);
                merged.get(merged.size() - 1).set(1, Math.max(currentEnd, interval.get(1)));
            }
        }

        return merged;
    }
}