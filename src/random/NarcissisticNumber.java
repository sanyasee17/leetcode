package random;

import java.util.Arrays;
import java.util.List;

public class NarcissisticNumber {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("50000", "55000");
        List<String> ans = list.stream()
                                .filter(NarcissisticNumber::checkNarcissisticNumber).toList();
        System.out.println(ans);
    }

    public static boolean checkNarcissisticNumber(String num) {
        int digits = num.length();
        return Integer.parseInt(num) == num.chars()
                                            .map(Character::getNumericValue)
                                            .map(digit -> (int) Math.pow(digit, digits))
                                            .sum();
    }
}
