package leetcode.LeetCode191;

// https://leetcode.com/problems/number-of-1-bits/description/

public class NumberOf1Bits {

    public static void main(String[] args) {
        NumberOf1Bits test = new NumberOf1Bits();

        // Case 1
        System.out.println("Case 1" + test.hammingWeight(11));
    }

    public int hammingWeight(int n) {
        return (int) Integer.toBinaryString(n).chars().filter(ch ->  ch == '1').count();
    }

    public int hammingWeight2(int n) {
        return Integer.bitCount(n);
    }


}
