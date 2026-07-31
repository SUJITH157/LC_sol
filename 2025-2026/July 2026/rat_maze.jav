class Solution {

    public static List<String> ratMaze(int row, int col, int[][] maze) {

        List<String> ans = new ArrayList<>();

        if (maze[0][0] == 0 || maze[row - 1][col - 1] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[row][col];

        solve(0, 0, row, col, maze, visited, "", ans);

        return ans;
    }

    static void solve(int i, int j, int row, int col,
                      int[][] maze,
                      boolean[][] visited,
                      String path,
                      List<String> ans) {

        if (i == row - 1 && j == col - 1) {
            ans.add(path);
            return;
        }

        visited[i][j] = true;

        if (i + 1 < row && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            solve(i + 1, j, row, col, maze, visited, path + "D", ans);
        }

        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            solve(i, j - 1, row, col, maze, visited, path + "L", ans);
        }

        if (j + 1 < col && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            solve(i, j + 1, row, col, maze, visited, path + "R", ans);
        }

        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            solve(i - 1, j, row, col, maze, visited, path + "U", ans);
        }

        visited[i][j] = false;
    }
}