package leetcode.contest.biweekly.LeetCode2825;


// https://leetcode.com/contest/biweekly-contest-111/problems/make-string-a-subsequence-using-cyclic-increments/
public class MakeStringASubsequenceUsingCyclicIncrements {

    public boolean canMakeSubsequence(String str1, String str2) {
        boolean result = false;
        int j = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(j >= str2.length()) {
                return result;
            }
            char ch = str2.charAt(j);
            char tempChar = str1.charAt(i);
            if(ch == tempChar || ch == getNextCyclicChar(tempChar)) {
                result = true;
                j++;
            } else {
                result = false;
            }
        }
        return str2.length() == j ? result : false;
    }

    private char getNextCyclicChar(char ch) {
        if(ch == 'z') {
            return 'a';
        }
        return (char) (ch + 1);
    }
}
