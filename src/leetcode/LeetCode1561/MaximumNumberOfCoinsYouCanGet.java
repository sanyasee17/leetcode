package leetcode.LeetCode1561;

// https://leetcode.com/problems/maximum-number-of-coins-you-can-get/description/

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {

    public static void main(String[] args) {

        MaximumNumberOfCoinsYouCanGet test = new MaximumNumberOfCoinsYouCanGet();
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(test.maxCoins(piles));

    }

    public int maxCoins(int[] piles) {
        int result = 0;
        Arrays.sort(piles);
        for (int i = piles.length / 3 ; i < piles.length; i += 2) {
            result += piles[i];
        }
        return result;
    }

}
