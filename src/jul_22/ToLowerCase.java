package jul_22;

// https://leetcode.com/problems/to-lower-case/

public class ToLowerCase {
    public static void main(String[] args) {


        // how to get a Lower Case of a Upper Cse Letter
        char ch = 'C';
        char chSmall = (char) (ch - 'A' + 'a');
        System.out.println(chSmall);


        // test the method

        String str = "Hello Sanyasee";
        String ans = toLowerCase2(str);
        System.out.println(ans);

    }

    static String toLowerCase(String s) {

        return s.toLowerCase();
    }

    // Without Library Method

    static String toLowerCase2(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - 'A' + 'a');
            }
        }
        return String.valueOf(chars);
    }

}
