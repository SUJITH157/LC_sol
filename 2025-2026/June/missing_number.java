import java.util.*;

class Solution {
    
    int missingNum(int arr[]) {

        Arrays.sort(arr);

        if (arr.length == 1) {
            if (arr[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }

        if (arr[0] != 1) {
            return 1;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                continue;
            } else {
                return arr[i] + 1;
            }
        }

        return arr[arr.length - 1] + 1;
    }
}