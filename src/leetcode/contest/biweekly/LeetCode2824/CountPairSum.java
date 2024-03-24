package leetcode.contest.biweekly.LeetCode2824;

import java.util.List;

// https://leetcode.com/contest/biweekly-contest-111/problems/count-pairs-whose-sum-is-less-than-target/
public class CountPairSum {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
