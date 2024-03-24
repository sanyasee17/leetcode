package leetcode.LeetCode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/
public class CombinationSum2 {

    int target;
    int[] candidates;

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0) {
            return new ArrayList<>();
        }
        this.target = target;
        Arrays.sort(candidates);
        this.candidates = candidates;
        backTrack(new ArrayList<>(), 0, 0);
        return result;
    }

    private void backTrack(List<Integer> currentCandidates, int currentSum, int currentIndex) {
        if(currentSum > target) {
            return;
        }
        // Base Condition
        if(currentSum == target) {
            result.add(new ArrayList<>(currentCandidates));
            return;
        }
        for(int i = currentIndex; i < candidates.length; i++) {
            // Add on Condition
            if(i > currentIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            currentCandidates.add(candidates[i]);
            currentSum += candidates[i];
            // Explore
            backTrack(currentCandidates, currentSum, i + 1);
            // Remove
            currentSum -= currentCandidates.remove(currentCandidates.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        CombinationSum2 test = new CombinationSum2();
        System.out.println(test.combinationSum2(arr, target));
    }

}
