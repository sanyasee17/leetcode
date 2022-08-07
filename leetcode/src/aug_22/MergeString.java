package com.sanyasee.leetcode;

// https://leetcode.com/problems/merge-strings-alternately/

public class MergeString {
    public static void main(String[] args) {
        String answer = mergeAlternately("ab", "pqrs");
        System.out.println(answer);
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();
        int i = 0;

        while(i < length1 && i < length2){
            answer.append(word1.charAt(i));
            answer.append(word2.charAt(i));
            i++;
        }

        if(i != length1){
            answer.append(word1.substring(i));
        }
        if(i != length2){
            answer.append(word2.substring(i));
        }
        return answer.toString();
    }
}
