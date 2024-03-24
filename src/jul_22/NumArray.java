package jul_22;

// https://leetcode.com/problems/range-sum-query-mutable/

import java.util.ArrayList;

public class NumArray {

    int[] nums;
    int totalSum = 0;

    public NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 0; i < nums.length; i++ ){
            this.totalSum += this.nums[i];
        }
    }

    public void update(int index, int val) {
        this.totalSum += val - nums[index];
        this.nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = 0; i <left; i++ ){
            sum -= this.nums[i];
        }
        for (int i = right + 1; i < nums.length; i++ ){
            sum -= this.nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[] {1, 3, 5});

        ArrayList<Integer> list = new ArrayList<>();

    }
}
