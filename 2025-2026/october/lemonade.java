
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[3];
        int i = 0;

        money[0] = 0;
        money[1] = 0;
        money[2] = 0;

        if (bills[0] > 5) {
            return false;
        }

        while (i < bills.length) {
            if (bills[i] == 5) {
                money[0] += 1;
            }
            else if (bills[i] == 10) {
                if (money[0] > 0) {
                    money[0] -= 1;
                    money[1] += 1;
                }
                else {
                    return false;
                }
            }
            else if (bills[i] == 20) {
                if (money[1] > 0 && money[0] > 0) {
                    money[0] -= 1;
                    money[1] -= 1;
                    money[2] += 1;
                }
                else if (money[0] >= 3) {
                    money[0] -= 3;
                    money[2] += 1;
                }
                else {
                    return false;
                }
            }

            i++;
        }

        return true;
    }
}
