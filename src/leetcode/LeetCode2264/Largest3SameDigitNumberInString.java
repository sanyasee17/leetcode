package leetcode.LeetCode2264;

// https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/

public class Largest3SameDigitNumberInString {

    public static void main(String[] args) {

        Largest3SameDigitNumberInString test = new Largest3SameDigitNumberInString();


    }

    public String largestGoodInteger(String num) {

        String result = "";
        String temp = "";

        for (char ch : num.toCharArray()) {
            if(!temp.contains(String.valueOf(ch))) {
                temp = "";
            }
            temp = ch + "";

            

            result = temp;

//            if ()
        }
        return null;

    }


}
