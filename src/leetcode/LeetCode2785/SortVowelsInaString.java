package leetcode.LeetCode2785;

import java.util.Arrays;

// https://leetcode.com/problems/sort-vowels-in-a-string/description/
public class SortVowelsInaString {

    public static void main(String[] args) {

        SortVowelsInaString test = new SortVowelsInaString();

        String input = "lEetcOde";
        System.out.println(test.sortVowels(input));

    }

    public String sortVowels(String s) {

        // Extract the vowels
        int[] vowel = new int[s.length()];
        
        int i = 0;
        for (char ch:s.toCharArray()) {
            if(isVowel(ch)) {
                vowel[i] = (int) ch;
                i++;
            }
        }
        i = 0;
        Arrays.sort(vowel);
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if(isVowel(ch)) {
                result.append((char) vowel[i]);
                i++;
            } else {
                result.append(ch);
            }
        }

        return result.toString();

    }

    private boolean isVowel(char ch) {
        return ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
         || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
