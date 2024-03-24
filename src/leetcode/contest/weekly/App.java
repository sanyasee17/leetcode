package leetcode.contest.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2};

        App test = new App();

//        System.out.println(test.minimumCoins(arr));

        int[] arr2 ={3, 1, 2};
        System.out.println(test.minimumCoins(arr2));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))) {
                result.add(i);
            }
        }
        return result;
    }

    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int count = 1;

        if(hBars.length < vBars.length) {
            for (int i = 0; i < hBars.length; i++) {
                if (hBars[i] == vBars[i]) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < vBars.length; i++) {
                if (hBars[i] == vBars[i]) {
                    count++;
                }
            }
        }

        return count * count;
    }

    public int minimumCoins(int[] prices) {

        int n = prices.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = prices[i - 1] + dp[i - 1];
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.min(dp[i], prices[j - 1] + dp[i - j - 1]);
            }
        }

        return dp[n];
    }
}
