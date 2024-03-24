package aug_22;

// https://leetcode.com/problems/ransom-note/

public class RansomNote {

    public static void main(String[] args) {
        boolean ans = canConstruct("aa", "aab");
        System.out.println(ans);
    }

    static boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length() < ransomNote.length()){
            return false;
        }
        ;
        int[] charCount = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            charCount[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            charCount[ransomNote.charAt(i) - 'a']--;
        }

        for(int i : charCount){
            if(i < 0){
                return false;
            }
        }
        return true;

    }
}
