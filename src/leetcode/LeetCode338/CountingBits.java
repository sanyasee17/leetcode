package leetcode.LeetCode338;


// https://leetcode.com/problems/counting-bits/

public class CountingBits {


    public int[] countBits(int n) {

        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String binaryValue = Integer.toBinaryString(i);
            System.out.println(i + " ->  " + binaryValue);
            result[i] = (int) binaryValue.chars().filter(ch -> ch == '1').count();
        }
        return result;
    }


    // Optimised Solution by Bunty
    public int[] countBits2(int n) {

        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i - 1] + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountingBits test = new CountingBits();
        test.countBits(32);
        /*
        See the pattern to understand countBits2 solution

        Jadi number ta even achhi
        then sethire re setiki ta 1 acchi, jetik sei number / 2 re achhi


        Jadi odd then ta purba even number jetiki ta achhi + 1



         */

    }
}
