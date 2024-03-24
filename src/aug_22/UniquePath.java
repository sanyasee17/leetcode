package aug_22;

// https://leetcode.com/problems/unique-paths/

public class UniquePath {
    public static void main(String[] args) {

    }

    // Using Combination

    // m + n - 2 choices
    // n- 1 selections
    // nCr = n! / ( r! * (n - r))
    static int uniquePaths(int m, int n) {
        return comb(m+n-2, n-1);
    }

    static int comb(int n, int r){
        long ans = 1; // n!/(r!*(n-r)!)
        for (int i=r+1; i <= n; i++){
            ans = (ans * i) / (i-r);
        }
        return (int)ans;
    }


}
