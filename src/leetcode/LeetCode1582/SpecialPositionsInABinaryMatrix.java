package leetcode.LeetCode1582;

// https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/

public class SpecialPositionsInABinaryMatrix {

    public static void main(String[] args) {

        SpecialPositionsInABinaryMatrix test = new SpecialPositionsInABinaryMatrix();
//        int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println("Special Count: " + test.numSpecial(mat));

    }

    // Working, but to be Optimise
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
                if(mat[row][col] == 0) {
                    continue;
                }
                boolean isSpecial = true;

                // check row
                for (int i = 0; i < mat.length; i++) {
                    if(i != row && mat[i][col] == 1) {
                        isSpecial = false;
                    }
                }
                // check col
                for (int j = 0; j < mat[0].length; j++) {
                    if(j != col && mat[row][j] == 1) {
                        isSpecial = false;
                    }
                }
                if (isSpecial) {
                    ans++;
                }
            }
            System.out.println();
        }
        return ans;
    }
}
