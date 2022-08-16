package aug_22;

// https://leetcode.com/problems/first-unique-character-in-a-string/

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);

        System.out.println(ans);
    }

    static int firstUniqChar(String s) {

        for (char ch : s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}
