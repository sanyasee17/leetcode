package leetcode.LeetCode229;

// https://leetcode.com/problems/majority-element-ii/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {


    public static void main(String[] args) {
        MajorityElementII test = new MajorityElementII();
        int[] arr = {3,2,3};
        System.out.println(test.majorityElement(arr));
    }


    public List<Integer> majorityElement(int[] nums) {

        if(nums.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        // Get the count of each number and store in a map
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int count = nums.length / 3;
        for (int key : hashMap.keySet()) {
            if(hashMap.get(key) > count) {
                result.add(key);
            }
        }

        return result;
    }
}
