class solution
public class goldcoins(int[] coins, int amount) {
    int n = coins.length;
    int left = 0;
    int right = 0;
    int minroom = 0;
    int sum=0;

    while(left<right){
        
        if(sum<amount){
            sum+=coins[right];
            right++;
        }else{
            sum-=coins[left];
            left++;
        }
    }
    
}
