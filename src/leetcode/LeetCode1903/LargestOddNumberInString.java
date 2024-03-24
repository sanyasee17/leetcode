package leetcode.LeetCode1903;

// https://leetcode.com/problems/largest-odd-number-in-string/description/

public class LargestOddNumberInString {

    public static void main(String[] args) {
        LargestOddNumberInString test = new LargestOddNumberInString();

        System.out.println(test.largestOddNumber("35427"));
    }

    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            if((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
