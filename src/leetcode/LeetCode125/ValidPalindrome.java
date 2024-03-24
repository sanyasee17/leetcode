package leetcode.LeetCode125;

// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(isAlphaNumeric(ch)) {
                str.append(ch);
            }
        }
        return str.toString().trim().equalsIgnoreCase(str.reverse().toString().trim());
    }

    private boolean isAlphaNumeric(char ch) {
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
}
