import java.util.*;

class Solution {
    
    public int countSubarrays(int[] A, int k) {
       
        Map<Integer, Integer> freq = new HashMap<>();
        
        freq.put(0, 1);

        
        int prefixXor = 0;
        
        int count = 0;

        
        for (int num : A) {
            
            prefixXor ^= num;

            
            int target = prefixXor ^ k;

            // If target exists in map, add its frequency
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }

            
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;
    }
}


