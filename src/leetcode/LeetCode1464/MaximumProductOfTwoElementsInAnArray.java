package leetcode.LeetCode1464;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {

    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray test = new MaximumProductOfTwoElementsInAnArray();
        System.out.println();
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1 ) * (nums[nums.length - 2] - 1 );
    }
}
