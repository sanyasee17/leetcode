package leetcode.LeetCode17;

import java.util.ArrayList;
import java.util.List;

public class App {

    List<String> result = new ArrayList<>();
    String digits;

    String[] digitStringMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return result;
        }
        this.digits = digits;
        backTrack(0, new StringBuilder());
        return result;
    }

    private void backTrack(int currentIndex, StringBuilder currentCombination) {

        if(currentCombination.toString().length() == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        int currentDigit = Integer.valueOf(digits.charAt(currentIndex) - '0');
        String currentString = digitStringMap[currentDigit - 2];

        for (int i = 0; i < currentString.length(); i++) {
            currentCombination.append(currentString.charAt(i));
            backTrack(currentIndex + 1, currentCombination);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

    public static void main(String[] args) {
        App test = new App();
        System.out.println(test.letterCombinations("23"));

    }


}
