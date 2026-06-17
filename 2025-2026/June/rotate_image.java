class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int arr[][] = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = matrix[n-j-1][i];

            }
        }

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}