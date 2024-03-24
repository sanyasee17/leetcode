package leetcode.LeetCode68;


// https://leetcode.com/problems/text-justification/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        int wordCount = 0;
        List<String> result = new ArrayList<>();

        while(wordCount < words.length) {
            List<String> currentLine = getLineWords(wordCount, words, maxWidth);
            wordCount += currentLine.size();
            result.add(adjustSpaces(currentLine, maxWidth));
        }

        return result;
    }

    private List<String> getLineWords(int wordCount, String[] words, int maxLength) {
        int lineLength = 0;
        List<String> line = new ArrayList<>();

        while(wordCount < words.length && lineLength + words[wordCount].length() <= maxLength) {
            line.add(words[wordCount]);
            lineLength += words[wordCount].length() + 1;
            wordCount++;
        }

        return line;
    }

    private String adjustSpaces(List<String> lineWords, int maxWidth) {
        int extraSpaces = maxWidth - String.join(" ", lineWords).length();
        int places = lineWords.size() - 1;
        int i = 0;


        while(extraSpaces != 0) {
            if(i >= places) {
                i = 0;
            }
            lineWords.set(i, lineWords.get(i) + " ");
            extraSpaces--;
            i++;
        }

        return String.join(" ",lineWords);
    }

    public static void main(String[] args) {
        TextJustification test = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxLength = 16;
        System.out.println(test.fullJustify(words, maxLength));
    }

}
