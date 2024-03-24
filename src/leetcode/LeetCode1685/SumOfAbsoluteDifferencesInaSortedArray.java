package leetcode.LeetCode1685;

// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/description/

import java.util.Arrays;

public class SumOfAbsoluteDifferencesInaSortedArray {

    public static void main(String[] args) {

        SumOfAbsoluteDifferencesInaSortedArray test = new SumOfAbsoluteDifferencesInaSortedArray();

        int[] nums = {1,4,6,8,10};

        System.out.println(Arrays.toString(test.getSumAbsoluteDifferencesOptimised(nums)));


    }

    // Time Limit Exceeds
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int size = nums.length;
        int[] result  = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += Math.abs(nums[i] - nums[j]);
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }

    public int[] getSumAbsoluteDifferencesOptimised(int[] nums) {
        int size = nums.length;
        int[] result  = new int[size];
        int rightSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < size; i++) {
            int num = nums[i];
            rightSum -= num;

            // left of i are smaller && right of i are bigger
            result[i] = num * i - leftSum + rightSum - num * (size - i - 1);
            leftSum += num;

        }
        return result;
    }

}
