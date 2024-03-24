package leetcode.LeetCode1727;

import java.util.Arrays;

public class LargestSubmatrixWithRearrangements {

    public static void main(String[] args) {

    }

    public int largestSubmatrix(int[][] matrix) {

        int ans = 0;
        int size = matrix[0].length;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col] != 0 && row > 0) {
                    matrix[row][col] += matrix[row - 1][col];
                }
            }

            int[] tempRow = matrix[row].clone();
            Arrays.sort(tempRow);
            for (int i = 0; i < size; i++) {
                ans = Math.max(ans, tempRow[i] * (size - i));
            }
        }
        return ans;
    }
}
