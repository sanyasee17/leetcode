package leetcode.LeetCode17;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    String[] digitStringMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> result = new ArrayList<>();
    String digits;


    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return result;
        }
        this.result = new ArrayList<>();
        this.digits = digits;

        letterCombinations(0, new StringBuilder());

        return result;
    }


    public void letterCombinations(int currentCount, StringBuilder currentCombination) {
        if ( currentCount == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        int currentDigit = Integer.valueOf(digits.charAt(currentCount) - '0');
        String letters = digitStringMap[currentDigit - 2];

        for (int i = 0; i < letters.length(); i++) {
            currentCombination.append(letters.charAt(i));
            letterCombinations(currentCount + 1, currentCombination);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }

    }

    public static void main(String[] args) {
        LetterCombinations test = new LetterCombinations();
        List<String> result = test.letterCombinations("23");
        result.forEach(System.out :: println);
    }
}





