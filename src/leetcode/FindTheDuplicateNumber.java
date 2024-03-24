package leetcode;

// https://leetcode.com/problems/find-the-duplicate-number

import java.util.Arrays;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        FindTheDuplicateNumber test = new FindTheDuplicateNumber();
        int[] testCase0 = {1,3,4,2,2}; // output = 2
        System.out.println("Duplicate Number is: " + test.findDuplicate(testCase0));

    }

    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    // Optimise
    public int findDuplicate2(int[] nums) {
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i + 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }else{
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
