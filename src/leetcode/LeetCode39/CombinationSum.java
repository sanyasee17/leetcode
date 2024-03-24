package leetcode.LeetCode39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    int target;
    int[] candidates;

    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int target = 7;
        CombinationSum test = new CombinationSum();
        List<List<Integer>> ans = test.combinationSum(arr, target);

        ans.forEach(System.out::println);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        this.target = target;
        this.candidates = candidates;

        backTrack(0, new ArrayList<Integer>(), 0);

        return result;


    }

    private void backTrack(int currentSum, ArrayList<Integer> combinations, int currentIndex) {

//        System.out.println(combinations);

        if(currentSum == target) {
            result.add(new ArrayList<>(combinations));
        }

        if(currentSum > target) {
            return;
        }

        for (int i = currentIndex; i < candidates.length; i++) {

            // Add
            currentSum += candidates[i];
            combinations.add(candidates[i]);

            // Explore
            backTrack(currentSum, combinations, i);

            // Remove
            currentSum -= combinations.remove(combinations.size() - 1);


        }
    }
}
