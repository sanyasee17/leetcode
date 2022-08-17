package jul_22;

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

public class NumberOfStrings {
    public static void main(String[] args) {

        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";

        System.out.println(numOfStrings(patterns, word));

    }

     static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
