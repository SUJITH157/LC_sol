import java.util.*;

class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;

        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<int[]> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (img1[i][j] == 1) {
                    a.add(new int[]{i, j});
                }

                if (img2[i][j] == 1) {
                    b.add(new int[]{i, j});
                }
            }
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {

            int[] x = a.get(i);

            for (int j = 0; j < b.size(); j++) {

                int[] y = b.get(j);

                int row = x[0] - y[0];
                int col = x[1] - y[1];

                String key = row + "," + col;

                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int max = 0;

        for (int i = 0; i < map.size(); i++) {
           
        }

        for (Integer value : map.values()) {
            max = Math.max(max, value);
        }

        return max;
    }
}