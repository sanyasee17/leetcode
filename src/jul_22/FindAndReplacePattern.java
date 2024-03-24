package jul_22;

// https://leetcode.com/problems/find-and-replace-pattern/

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        System.out.println(isPatternMatched("mege", "abbb"));
    }

    static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> result = new ArrayList<>();

        for(String word : words){
            if(isPatternMatched(word, pattern)){
                result.add(word);
            }
        }
        return result;
    }

    // Method to check if the word matches the pattern
    static boolean isPatternMatched(String word, String pattern) {

        for (int i = 0; i < word.length(); i++) {

            if (word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
