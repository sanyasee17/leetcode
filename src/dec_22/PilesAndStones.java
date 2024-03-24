package dec_22;

import java.util.*;

// https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/

public class PilesAndStones {
    public static void main(String[] args) {
        int[] piles = {5,4,9};

        System.out.println(minStoneSum(piles, 2));

    }

    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int pile : piles) priorityQueue.add(pile);
        for (int i = 0; i < k; i++) {
            int pile = priorityQueue.poll();
            priorityQueue.add(pile - pile/2);
        }
        return priorityQueue.stream().reduce(0, Integer::sum);
    }
}
