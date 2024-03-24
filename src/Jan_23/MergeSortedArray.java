package Jan_23;

// https://leetcode.com/problems/merge-sorted-array/description/

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};

        int[] nums1 = {0};
        int[] nums2 = {2};
        merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] total = new int[m + n];


        while (k < m + n) {
            if (i == m) {
                total[k++] = nums2[j++];
                continue;
            } else if (j == n) {
                total[k++] = nums1[i++];
                continue;
            }
            if (nums1[i] < nums2[j]) {
                total[k++] = nums1[i++];
            } else {
                total[k++] = nums2[j++];
            }
        }
        for (int a = 0; a < m + n; a++) {
            nums1[a] = total[a];
        }
    }

}
