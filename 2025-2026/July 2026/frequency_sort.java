import java.util.*;

class Solution {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {

            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }

            return a - b;
        });

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {

            char ch = list.get(i);
            int freq = map.get(ch);

            for (int j = 0; j < freq; j++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}