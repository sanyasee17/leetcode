package leetcode.LeetCode78;

// https://leetcode.com/problems/subsets

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        backTrack(0, new ArrayList<>());
        return result;
    }

    private void backTrack(int currentIndex, ArrayList<Integer> currentCombination) {
        System.out.println(currentCombination);
        result.add(new ArrayList<>(currentCombination));

        for (int i = currentIndex; i < nums.length; i++) {
            currentCombination.add(nums[i]);
            backTrack(i + 1, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets test = new Subsets();
        int[] nums = {1, 2, 3};
        test.subsets(nums);
    }
}
