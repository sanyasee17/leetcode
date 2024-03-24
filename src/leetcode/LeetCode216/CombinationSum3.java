package leetcode.LeetCode216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    List<List<Integer>> result = new ArrayList<>();
    int combinationSize;
    int targetSum;

    public List<List<Integer>> combinationSum3(int k, int n) {

        if(k * (k + 1) > 2 * n) {
            return result;
        }

        combinationSize = k;
        targetSum = n;
        backTrack(0, 1, new ArrayList<>());
        return result;
    }

    private void backTrack(int currentSum, int currentIndex, List<Integer> currentCombination) {

        System.out.println(currentCombination);

        // Base Condition
        // Early Optimization

        if(currentSum > targetSum || currentCombination.size() > combinationSize) {
            return;
        }

        if(currentCombination.size() == combinationSize && currentSum == targetSum) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = currentIndex; i < 10; i++) {

            // Add
            currentCombination.add(i);
            currentSum += i;

            // Explore
            backTrack(currentSum, i + 1, currentCombination);

            // Remove
            currentSum -= currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {

        CombinationSum3 test = new CombinationSum3();
        List<List<Integer>> ans = test.combinationSum3(3, 7);
        ans.stream().forEach(System.out::println);

    }


}
