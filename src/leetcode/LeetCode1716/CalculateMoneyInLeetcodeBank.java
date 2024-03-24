package leetcode.LeetCode1716;

// https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/

public class CalculateMoneyInLeetcodeBank {

    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank test = new CalculateMoneyInLeetcodeBank();
        System.out.println(test.totalMoney(4));
        System.out.println(test.totalMoney(10));
        System.out.println(test.totalMoney(20));
        System.out.println(test.totalMoney(14));
        System.out.println(test.totalMoney2(14));
    }

    public int totalMoney(int n) {

        int start = 0;
        int temp = 0;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            if(i % 7 == 1) {
                start++;
                temp = start;
            }
            sum += temp;
            temp++;

        }
        return sum;
    }

    public int totalMoney2(int n) {



        int q = n / 7;
        int r = n % 7;

        int sum1 = ((q * (q + 1) / 2) * 7);
        int sum2 = (q * 21);
        int sum3 = ((q + 1) * r + r * (r - 1) / 2);

        return sum1 + sum2 + sum3;
    }

    /*

    1 + 2 + 3 + 4 + 5 = 15

    5 + 4 + 3 + 2 + 1 = 15

    6   6   6   6   6

    6 * 5 / 2 = 15


    1 + 2 + 3 + 4 + 5 + .... + n = n * (n + 1) / 2

    - 1 / 12 

     */
}
