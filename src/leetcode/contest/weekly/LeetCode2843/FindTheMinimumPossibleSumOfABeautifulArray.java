package leetcode.contest.weekly.LeetCode2843;

// Contest 360
// https://leetcode.com/contest/weekly-contest-360/problems/find-the-minimum-possible-sum-of-a-beautiful-array/

import java.util.HashSet;


public class FindTheMinimumPossibleSumOfABeautifulArray {

    public long minimumPossibleSum(int n, int target) {
        HashSet<Integer> resultSet = new HashSet<>();
        long sum = 0;
        int i = 1;
        while(resultSet.size() != n) {
            if(!resultSet.contains(target - i)) {
                resultSet.add(i);
                sum += i;
            }
            i++;
        }

        // System.out.println(resultSet);
        return sum ;
    }
}
