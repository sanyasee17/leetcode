package leetcode.LeetCode1326;

// https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Solution Kama karuni, Pachhare Dekhiba :)

public class MinTapsToOpenToWaterAGarden {

    public int minTaps(int n, int[] ranges) {

        List<List<Integer>> taps = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int start = i - ranges[i];
            int end = i + ranges[i];
            taps.add(Arrays.asList(start, end));
        }
        taps.sort((tap1, tap2) -> Integer.compare(tap1.get(0), tap2.get(0)));

        int tapCount = 0;
        int start = 0;
        int end = start + 1;

        for (int i = 0; i < n; i++) {
            for (List<Integer> tap : taps) {
                if(start >= tap.get(0) && end <= tap.get(1)) {
                    start = tap.get(0);
                    end = tap.get(1);
                    tapCount++;
                } else {

                }
            }
        }

//        for (List<Integer> tap : taps) {
//            System.out.println(tap);




//            if(start < tap.get(0)) {
//                return -1;
//            }
//            if((tap.get(0) <= 0 || tap.get(0) >= start) && tap.get(1) > end) {
//                start = tap.get(0);
//                end = tap.get(1);
//                tapCount++;
//            }
//        }

        if(end >= n) {
            return tapCount - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        MinTapsToOpenToWaterAGarden test = new MinTapsToOpenToWaterAGarden();
        int[] ranges = {3,2,1,1,0,0};
        int n = 5;
//        int[] ranges = {0, 0, 0, 0};
//        int n = 3;
//        int[] ranges = {1,2,1,0,2,1,0,1};
//        int n = 7;
//        int[] ranges = {4,0,0,0,0,0,0,0,4};
//        int n = 8;
        System.out.println(test.minTaps(n, ranges));
    }

}
