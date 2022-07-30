package jul_22;

// https://leetcode.com/problems/word-subsets/

import java.util.ArrayList;
import java.util.List;

public class WordSubset {
    public static void main(String[] args) {

        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};

        List<String> answer = wordSubsets(words1, words2);

        System.out.println(answer);

    }

    static List<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> list = new ArrayList<>();

        int[] allCharCountOfWords2 = new int[26];

        for(String word : words2){
            int[] tempCharCount = getCharCount(word);
            for(int i = 0; i < 26; i++){
                allCharCountOfWords2[i] = Math.max(allCharCountOfWords2[i], tempCharCount[i]);
            }
        }


        for (String word : words1){
            int[] tempCharCount = getCharCount(word);
            int i;
            for (i = 0; i < 26; i++) {
                if(tempCharCount[i] < allCharCountOfWords2[i]){
                    break;
                }
            }
            if(i == 26){
                list.add(word);
            }
        }

        return list;
    }


    static int[] getCharCount(String word) {
        int[] charCount = new int[26];
        for (char ch : word.toCharArray()) {
            charCount[ch - 'a']++;
        }
        return charCount;
    }
}
