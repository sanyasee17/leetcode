package jul_22;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseIII {
    public static void main(String[] args) {
        String sentence = "Let's take LeetCode contest";

        System.out.println(reverseWords(sentence));

    }

    static String reverseWords(String s) {

        String[] answer = s.split(" ");

        for (int i = 0; i < answer.length; i++){
            answer[i] = reverse(answer[i]);
        }
        return String.join(" ", answer);
    }

    static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
