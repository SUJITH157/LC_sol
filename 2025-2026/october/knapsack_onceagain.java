class solution{
    public int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] sack = new int[n][3];
        for(int i =0;i<n;i++){
            sack[i][0] = weights[i];
            sack[i][1] = values[i];
            sack[i][2] = (Double) values[i] / weights[i];
        }

        Arrays.sort(sack, (a, b) -> Double.compare(b[2], a[2]));

        int totalValue = 0;
        for(int i = 0; i<n;i++){
            if(capacity >= sack[i][0]){
                totalValue += sack[i][1];
                capacity -= sack[i][0];
            }else{
                totalValue += (capacity * sack[i][2]);
                break;
            }
        }
        return totalValue;

    }
}