import java.util.*;

public class BinaryConsec1 {

    public static ArrayList<String> binaryConsec1(int n) {

        ArrayList<String> result = new ArrayList<>();

        int total = 1 << n; //we can also use Math.pow(2, n) to calculate total number of binary strings of length n    

        for (int i = 0; i < total; i++) {

            String s = Integer.toBinaryString(i);

            while (s.length() < n) {
                s = "0" + s;
            }

            if (!isConsecutive(s)) {
                result.add(s);
            }
        }

        return result;
    }

    public static boolean isConsecutive(String s) {

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == '1' && s.charAt(i - 1) == '1') {
                return true;
            }
        }

        return false;
    }
}