public class selection_sort {
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minindex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;

                }
            }

            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;  
        }
    }
}