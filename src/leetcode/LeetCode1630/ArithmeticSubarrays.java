package leetcode.LeetCode1630;

// https://leetcode.com/problems/arithmetic-subarrays/description/

import java.util.*;

public class ArithmeticSubarrays {

    public static void main(String[] args) {

        ArithmeticSubarrays test = new ArithmeticSubarrays();

//        int[] nums = {4,6,5,9,3,7};
//        int[] l  = {0, 0, 2};
//        int[] r = {2, 3, 5};

        int[] nums = {-1,-12,-3,-3,-2,-1,3,-4,-6,7,-10,4};
        int[] l  = {1,3,2,5};
        int[] r = {4,5,6,8};

        System.out.println(test.checkArithmeticSubarrays(nums, l, r));

    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {

            result.add(checkSubArray(Arrays.copyOfRange(nums, l[i], r[i] + 1)));

        }
        return result;
    }

    private boolean checkSubArray(int[] subArray) {
        if(subArray.length == 0) {
            return false;
        }
        if(subArray.length == 1) {
            return true;
        }
        Arrays.sort(subArray);
        int diff = subArray[1] - subArray[0];
        for (int i = 0; i < subArray.length - 1; i++) {

            if(subArray[i] - subArray[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }


}
