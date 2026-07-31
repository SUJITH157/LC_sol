class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];

        solve(0, n, board, col, diag1, diag2);

        return ans;
    }

    private void solve(int row,
                       int n,
                       char[][] board,
                       boolean[] col,
                       boolean[] diag1,
                       boolean[] diag2) {

        if (row == n) {

            List<String> ds = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                ds.add(new String(board[i]));
            }

            ans.add(ds);
            return;
        }

        for (int c = 0; c < n; c++) {

            if (col[c] || diag1[row - c + n - 1] || diag2[row + c]) {
                continue;
            }

            board[row][c] = 'Q';
            col[c] = true;
            diag1[row - c + n - 1] = true;
            diag2[row + c] = true;

            solve(row + 1, n, board, col, diag1, diag2);

            board[row][c] = '.';
            col[c] = false;
            diag1[row - c + n - 1] = false;
            diag2[row + c] = false;
        }
    }
}