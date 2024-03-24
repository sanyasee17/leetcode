package leetcode.LeetCode1424;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/diagonal-traverse-ii/description/
public class DiagonalTraverseII {

    public static void main(String[] args) {

        DiagonalTraverseII test = new DiagonalTraverseII();

        /*
        // Case 2
        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(1,2,3,4,5),
                Arrays.asList(6, 7),
                Arrays.asList(8),
                Arrays.asList(9, 10, 11),
                Arrays.asList(12, 13, 14, 15, 16)
        );
         */
        // Case 3
        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(14,12,19,16,9),
                Arrays.asList(13,14,15,8,11),
                Arrays.asList(11,13,1)
        );


        System.out.println(Arrays.toString(test.findDiagonalOrderOld(nums)));
    }


    // Time Limit Exceeds
    public int[] findDiagonalOrderOld(List<List<Integer>> nums) {

        if(nums.size() == 0) {
            return new int[0];
        }
        int row = 0;
        int col = 0;
        int i = 0;
        // find length of array
        int size = 0;
        int maxSize = Integer.MIN_VALUE;
        for(List<Integer> list : nums) {
            size += list.size();
            if(list.size() > maxSize) {
                maxSize = list.size();
            }
        }
        int[] result = new int[size];

        while (row < nums.size() && col < maxSize) {

            int x = row;
            int y = col;

            while(x > -1) {
                if(y < nums.get(x).size()) {
                    result[i] = (nums.get(x).get(y));
                    i++;
                }
                x--;
                y++;
            }

            if(row < nums.size() - 1) {
                row++;
            }else {
                col++;
            }
        }
        return result;
    }


    // Optimise : Diagonal Property (row + col) is same for all diagonal elements
    // Group Together
    // Loop > Bottom to Top and Left to Right to get the group of elements in order

    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        int size = 0;

        HashMap<Integer, List<Integer>> diagonalGroups = new HashMap<>();

        for (int row = nums.size() - 1; row >= 0; row--) {
            for (int col = 0; col < nums.get(row).size(); col++) {

                int diagonal = row + col;

                if(!diagonalGroups.containsKey(diagonal)) {
                    diagonalGroups.put(diagonal, new ArrayList<>());
                }

                diagonalGroups.get(diagonal).add(nums.get(row).get(col));
                size++;
            }
        }

        int[] result = new int[size];

        int i = 0;
        int diagonalKey = 0;

        while (diagonalGroups.containsKey(diagonalKey)) {
            for (int item: diagonalGroups.get(diagonalKey)) {
                result[i] = item;
                i++;
            }
            diagonalKey++;
        }

        return result;
    }




}
