package leetcode.LeetCode90;

// https://leetcode.com/problems/subsets-ii/

import leetcode.LeetCode78.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    List<List<Integer>> result = new ArrayList<>();
    int[] nums;


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        Arrays.sort(this.nums);
        backTrack(0, new ArrayList<>());
        return result;
    }

    private void backTrack(int currentIndex, ArrayList<Integer> currentCombination) {
        System.out.println(currentCombination);
        result.add(new ArrayList<>(currentCombination));

        for (int i = currentIndex; i < nums.length; i++) {
            if(i > currentIndex && nums[i] == nums[i - 1]) {
                continue;
            }
            currentCombination.add(nums[i]);
            backTrack(i + 1, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets2 test = new Subsets2();
        int[] nums = {1, 2, 2};
        test.subsetsWithDup(nums);
    }

}
