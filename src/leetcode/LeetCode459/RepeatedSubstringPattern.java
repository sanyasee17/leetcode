package leetcode.LeetCode459;

// https://leetcode.com/problems/repeated-substring-pattern/description/
public class RepeatedSubstringPattern {

    // Brute Force Solution
    public boolean repeatedSubstringPattern(String s) {
        if(s.isBlank()) {
            return false;
        }
        for (int i = s.length() / 2; i > 0; i--) {
            if(s.replace(s.substring(0, i), "").equals("")) {
                return true;
            }
        }
        return false;
    }

    // TODO: Optimize Solution
    public boolean repeatedSubstringPatternOptimized(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern test = new RepeatedSubstringPattern();

//        System.out.println(test.repeatedSubstringPattern("babbabbabbabbab"));
        System.out.println(test.repeatedSubstringPatternOptimized("abcabc"));
    }

}
