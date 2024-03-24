package leetcode.LeetCode2540;

// https://leetcode.com/problems/minimum-common-value/description

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumCommonValue {

    public static void main(String[] args) {

    }

    public int getCommon(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0) {
            return -1;
        }
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                return nums2[i];
            }
        }

        return -1;
    }


    // Use two pointer method
    public int getCommon2(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return -1;
        }
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {

            if (nums1[pointer1] == nums2[pointer2]) {
                return nums1[pointer1];
            } else if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }
        return -1;
    }
}
