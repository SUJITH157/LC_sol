class Solution {

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (solve(board, word, i, j, 0, visited)) {
                    return true;
                }

            }
        }

        return false;
    }

    private boolean solve(char[][] board, String word,
                          int row, int col,
                          int index,
                          boolean[][] visited) {

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length ||
            visited[row][col] ||
            board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        boolean down = solve(board, word, row + 1, col, index + 1, visited);

        boolean up = solve(board, word, row - 1, col, index + 1, visited);

        boolean right = solve(board, word, row, col + 1, index + 1, visited);

        boolean left = solve(board, word, row, col - 1, index + 1, visited);

        visited[row][col] = false;

        return down || up || right || left;
    }
}