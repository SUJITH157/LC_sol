class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
      
        int arr=0;
        for(int i=0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }

        while(low<=high){
            int mid = (low+high)/2;
            int ans =0;

            for(int i =0;i<nums.length;i++){
                ans += Math.ceil((double)nums[i]/mid);
            }

            if(ans <= threshold){
                arr = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }

        }
        return arr;        
    }
}