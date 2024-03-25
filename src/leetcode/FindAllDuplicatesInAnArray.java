package leetcode;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }

        // find all duplicates
        List<Integer> duplicates = new ArrayList();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;


    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
