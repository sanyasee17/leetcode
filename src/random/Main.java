package random;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main test = new Main();
//        System.out.println(test.canMakeSubsequence("oh", "hu"));

        System.out.println(test.numberOfBeautifulIntegers(10, 20, 3));
    }


    public int numberOfBeautifulIntegers(int low, int high, int k) {

        int resultCount = 0;
        for(int i = low; i <= high; i++) {
            if(String.valueOf(i).length() % 2 != 0) {
                continue;
            }
            if(i % k == 0 && isEvenOddCountMatch(i)) {
                resultCount++;
            }
        }
        return resultCount;
    }

    private boolean isEvenOddCountMatch(int num) {
        int oddCount = 0;
        int evenCount = 0;

        while(num > 0) {
            int digit = num % 10;
            if(digit % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }

        return evenCount == oddCount;
    }


    public boolean canMakeSubsequence(String str1, String str2) {
        boolean result = false;
        int j = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(j >= str2.length()) {
                return result;
            }
            char ch = str2.charAt(j);
            char tempChar = str1.charAt(i);
            if(ch == tempChar || ch == getNextCyclicChar(tempChar)) {
                result = true;
                j++;
            } else {
                result = false;
            }
        }
        return str2.length() == j ? result : false;
    }

    private char getNextCyclicChar(char ch) {
        if(ch == 'z') {
            return 'a';
        }
        return (char) (ch + 1);
    }



    

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
