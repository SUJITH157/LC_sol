class Solution {
    public long solve(int[] bt) {
        //your code goes here
        Arrays.sort(bt);
        long current =0;
        long acc = 0;
        for(int i =0;i<bt.length;i++){
            acc += current;
            current +=bt[i];
        }
        return acc/bt.length;
    }
}