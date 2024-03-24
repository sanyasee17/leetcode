package leetcode.LeetCode27;

// https://leetcode.com/problems/remove-element/

public class RemoveElement {


    public int removeElement(int[] nums, int val) {

        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        RemoveElement test = new RemoveElement();

        int[] arr = {3,2,2,3};
        int value = 3;

        System.out.println(test.removeElement(arr, value));
    }
}
