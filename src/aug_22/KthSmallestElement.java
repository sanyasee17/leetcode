package aug_22;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

public class KthSmallestElement {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

        int answer= kthSmallest(matrix, 8);
        System.out.println(answer);
    }

    static int kthSmallest(int[][] matrix, int k) {

        int len = matrix.length;
        int start = matrix[0][0];
        int end = matrix[len - 1][len - 1];

        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = getCountOfSmallerOrEqual(matrix, mid);
            System.out.println(count);
            if(count < k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int getCountOfSmallerOrEqual(int[][] matrix, int mid) {

        int row = 0;
        int col = matrix[0].length - 1;
        int count = 0;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] > mid) {
                col--;
            } else {
                count += col + 1;
                row++;
            }
        }
        return count;
    }


}
