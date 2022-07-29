package dsa;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class AlikeStrings {
    public static void main(String[] args) {
        String str = "textbook";

        boolean result = halvesAreAlike2(str);

        System.out.println(result);
    }

    static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        return vowelCount(s.substring(0, s.length() / 2)) == vowelCount(s.substring(s.length() / 2));

    }

    static int vowelCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


    // Slow may be
    static boolean halvesAreAlike2(String s) {
        s = s.toLowerCase();
        int mid = s.length() / 2;
        int count = 0;

        for (int i = 0; i < mid; i++) {

            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(mid + i))){
                count--;
            }
        }
        return count == 0;
    }

}
