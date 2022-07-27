package com.sanyasee.leetcode.java;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class CheckTwoStringEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }


    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }
}
