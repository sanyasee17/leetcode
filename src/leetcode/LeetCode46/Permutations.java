package leetcode.LeetCode46;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/

public class Permutations {

    List<List<Integer>> result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        backTrack(new ArrayList<Integer>());
        return result;
    }

    private void backTrack(ArrayList<Integer> currentCombination) {
        // Base Condition
        if (currentCombination.size() == nums.length) {
            // Found Result
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // Condition to Skip
            if (currentCombination.contains(nums[i])) {
                continue;
            }
            // Add
            currentCombination.add(nums[i]);
            // Explore
            backTrack(currentCombination);
            // Remove
            currentCombination.remove(currentCombination.size() - 1);
        }

    }
}
