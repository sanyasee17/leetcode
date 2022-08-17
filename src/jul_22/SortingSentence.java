package jul_22;

// https://leetcode.com/problems/sorting-the-sentence/

import java.util.HashMap;

public class SortingSentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";

        String ans = sortSentence(str);

        System.out.println(ans);
    }

    static String sortSentence(String s) {

        String[] words = s.split(" ");

        String[] answer = new String[words.length];

        for (String word : s.split(" ")) {
            int position = (int) word.charAt(word.length() - 1) - '0';
            answer[position - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", answer);

    }

    // Solution 2

    static String sortSentence2(String s) {

        String[] words = s.split(" ");

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (String word : words) {
            int position = (int) word.charAt(word.length() - 1) - '0';
            hashMap.put(position, word.substring(0, word.length() - 1));
        }


        for (int i = 1; i <= words.length; i++) {
            words[i - 1] = hashMap.get(i);
        }

        return String.join(" ", words);
    }

}
