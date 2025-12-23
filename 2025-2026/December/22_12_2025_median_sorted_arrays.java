class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
    
    int[] merged = new int[num1.length + num2.length];
    System.arraycopy(num1,0,merged,0,num1.length);
    System.arraycopy(num2,0,merged,num1.length,num2.length);

    Arrays.sort(merged);
    double median = 0;
    int n = merged.length;
    if(merged.length % 2 == 0){
        median = (merged[n/2 - 1] + merged[n/2]) / 2.0;

    }
    else 
        median = merged[(n-1)/2];

    System.out.println(median);
    return median;
    }
}

