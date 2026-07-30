class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> addOperators(String num, int target) {

        solve(num, target, 0, "", 0, 0);

        return ans;
    }

    private void solve(String num,int target,int index,String expr,long value,long prev) {

        if (index == num.length()) {

            if (value == target) {
                ans.add(expr);
            }

            return;
        }

        long current = 0;

        for (int i = index; i < num.length(); i++) {

            if (i > index && num.charAt(index) == '0') {
                break;
            }

            current = current * 10 + (num.charAt(i) - '0');

            String part = num.substring(index, i + 1);

            if (index == 0) {

                solve(num,target,i + 1,part,current,current);

            } else {

                solve(num,target,i + 1,expr + "+" + part,value + current,current);

                solve(num,target,i + 1,expr + "-" + part,value - current,-current);

                solve(num,target,i + 1,expr + "*" + part,value - prev + prev * current,prev * current);
            }
        }
    }
}