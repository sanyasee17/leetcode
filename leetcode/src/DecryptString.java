package dsa;

// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

public class DecryptString {
    public static void main(String[] args) {
        String str = "10#11#12";

        String answer = freqAlphabets2(str);

        System.out.println(answer);

        System.out.println((char) ('a' + 9));

    }

    static String freqAlphabets(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#'){
                // find the 2 digits number side to it and append the char value for that
                int secondDigit = (s.charAt(i - 1) - '0');
                int firstDigit = (s.charAt(i - 2) - '0');
                // here we will get the char from the number, and we know num = firstDigit + 10 * secondDigit
                // ex : 10 so (char) ('a' + (10 - 1))  will be 'j'

                System.out.println((10 * firstDigit) + secondDigit);
                char ch = (char) ('a' + ((10 * firstDigit) + secondDigit) - 1);

                answer.append(ch);
                i -= 2;

            } else {

                int digit = s.charAt(i) - '0';
                // ex : 1 so (char) ('a' + (1 - 1))  will be 'a'
                char ch = (char) ('a' + digit - 1);
                answer.append(ch);
            }

        }
        return answer.reverse().toString();
    }


    // Refactored code to optimize
    static String freqAlphabets2(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#'){
                answer.append((char) ('a' + ((10 * (s.charAt(i - 2) - '0')) + (s.charAt(i - 1) - '0')) - 1));
                i -= 2;

            } else {
                answer.append((char) ('a' + (s.charAt(i) - '0') - 1));
            }

        }
        return answer.reverse().toString();
    }
}
