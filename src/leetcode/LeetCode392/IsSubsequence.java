package leetcode.LeetCode392;

// https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int charIndex = 0;
        if(charIndex == s.length()) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(charIndex) == t.charAt(i)) {
                charIndex++;
            }
            if(charIndex == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsSubsequence test = new IsSubsequence();
        System.out.println(test.isSubsequence("abc", "ahbgdc"));
        System.out.println(test.isSubsequence("axc", "ahbgdc"));
    }
}
