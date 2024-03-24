package random;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public boolean makeEqual(String[] words) {

        if(words.length == 1) {
            return true;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (String word: words) {
            for(char ch: word.toCharArray()) {
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        for (char ch: map.keySet()) {
            if(map.get(ch) != words.length) {
                return false;
            }
        }
        return true;
    }
}
