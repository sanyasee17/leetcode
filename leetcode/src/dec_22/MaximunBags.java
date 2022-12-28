package dec_22;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/description/

public class MaximunBags {
    public static void main(String[] args) {
        int [] capacity = {91,54,63,99,24,45,78};
        int[] rocks = {35,32,45,98,6,1,25};
        int additionalRocks = 17;

        System.out.println(maximumBags(capacity,rocks,additionalRocks));
    }

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        for (int i = 0; i < rocks.length; i++) {
            rocks[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(rocks);
        for(int i = 0; i < rocks.length && rocks[i] - additionalRocks <= 0; i++){
            count++;
            additionalRocks -= rocks[i];

        }
        return count;
    }
}
