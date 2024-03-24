package leetcode.LeetCode1512;

// https://leetcode.com/problems/number-of-good-pairs/description/

import java.util.HashMap;

public class NumberOfGoodPairs {


    public static void main(String[] args) {

        NumberOfGoodPairs test = new NumberOfGoodPairs();

        int[] nums = {1,2,3,1,1,3};

        System.out.println(test.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {

        int result = 0;

        // Get the count of each number and store in a map
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if(hashMap.containsKey(num)) {
                hashMap.replace(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        // Calculate Permutation

        for (int key : hashMap.keySet()) {
            // (n * (n - 1)) / 2
            if(hashMap.get(key) > 1) {
                result += hashMap.get(key) * (hashMap.get(key) - 1) / 2;
            }
        }
        return result;
    }

}
