package leetcode.LeetCode70;

import java.util.HashMap;

public class ClimbingStairs {

    // Not Working now
    public int climbStairs(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if(n <= 2) {
            return n;
        }
        if(map.get(n) == null) {
            map.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        ClimbingStairs test = new ClimbingStairs();
        System.out.println(test.climbStairs(3));
    }
}
