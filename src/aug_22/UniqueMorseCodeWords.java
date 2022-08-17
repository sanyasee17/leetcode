package aug_22;

// https://leetcode.com/problems/unique-morse-code-words/

import java.util.HashSet;

public class UniqueMorseCodeWords {



    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> hashSet = new HashSet<>();

        for (String word : words) {
            hashSet.add(transform(word, morseCodes));
        }
        return hashSet.size();
    }

    private String transform(String word, String[] morseCodes) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            sb.append(morseCodes[(int) ch - 97]);
        }
        return sb.toString();
    }


}
