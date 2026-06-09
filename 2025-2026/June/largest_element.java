import java.util.*;

class largestElement {
    public static int sort(int[] arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        largestElement s = new largestElement();
        int highest = s.sort(new int[]{1, 5, 3, 9, 2});
        System.out.println("largest element is :"+highest);
    }
}