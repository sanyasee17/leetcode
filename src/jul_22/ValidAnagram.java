package jul_22;

// https://leetcode.com/problems/valid-anagram/

import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "pot";
        String t = "top";

        boolean answer = isAnagram2(s, t);
        System.out.println(answer);
    }


    // Using Character count
    static boolean isAnagram(String s, String t) {

            if(s.length() != t.length()){
                return false;
            }
            // Character count
            int[] charCount = new int[26];

            for (int i = 0; i < s.length(); i++) {
                charCount[s.charAt(i) - 'a']++;
                charCount[t.charAt(i) - 'a']--;
            }

        for(int i : charCount){
            if(i != 0){
                return false;
            }
        }

        return true;
    }

    // Solution 2 : using sort()
    static boolean isAnagram2(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }


    // Solution 3 : too slow
    static boolean isAnagram3(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            int index = list.indexOf(t.charAt(i));
            if(index != -1) {
                list.remove(index);
            } else {
                return false;
            }

        }
        return list.size() == 0;
    }




}
