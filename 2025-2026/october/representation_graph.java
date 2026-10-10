import java.util.*;

class Main {
    public static void main(String[] args) {

        int vertices = 5;

        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 3},
            {2, 3},
            {3, 4}
        };

        ArrayList<ArrayList<Integer>> adj =
            new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }
}