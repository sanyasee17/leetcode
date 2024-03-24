package leetcode.LeetCode1335;

// https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/description/

import java.util.ArrayList;
import java.util.List;

public class MinimumDifficultyOfAJobSchedule {

    int[] nums;
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> currentList = new ArrayList<>();

    public static void main(String[] args) {
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        int[] arr = {6, 5, 4, 3, 2, 1};
        int[] arr2 = {6, 5, 4};
        int[] arr3 = {11,111,22,222,33,333,44,444};
//        System.out.println(test.minDifficulty(arr, 2));
//        System.out.println(test.minDifficulty(arr2, 2));
        System.out.println(test.minDifficulty(arr3, 6));
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        if(d > jobDifficulty.length) {
            return -1;
        }
        this.nums = jobDifficulty;
        recurse(0, d);

        System.out.println(list);

        int ans = Integer.MAX_VALUE;

        for (List<Integer> temp : list) {

            // Extract Array for each index
            int tempMax = 0;
            for (int i = 0; i < temp.size(); i++) {
                if(i == 0) {
                    tempMax += findMax(0, temp.get(i));
                }
                else {
                    tempMax += findMax(temp.get(i - 1) + 1, temp.get(i));
                }
            }
            tempMax += findMax(temp.get(temp.size() - 1) + 1, nums.length - 1);
            System.out.println("Temp Max " + tempMax);
            ans = Math.min(ans, tempMax);
        }

        return ans;
    }

    private int findMax(int start , int end) {

        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            max = Math.max(max,nums[i]);
        }
        return max;
    }

    private void recurse(int currentIndex, int currentDiv) {

        if(currentDiv == 1 && currentIndex < nums.length) {
            list.add(new ArrayList<>(currentList));
//            currentList = new ArrayList<>();
            return;
        }

//        if(currentDiv < 1) {
//            currentList = new ArrayList<>();
//            return;
//        }



        for (int i = currentIndex; i < nums.length; i++) {
            currentList.add(i);
            recurse(i + 1, currentDiv - 1);
            currentList.remove(currentList.size() - 1);
        }

    }
}
