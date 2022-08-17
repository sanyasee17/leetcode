package aug_22;

// https://leetcode.com/problems/longest-increasing-subsequence/

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};


        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

        int ans = lis.lengthOfLIS(arr);
        System.out.println(ans);
    }

    List<Integer> list = new ArrayList<>();
    public int lengthOfLIS(int[] nums) {
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > list.get(list.size() - 1)) list.add(num);
            else list.set(binarySearch(num), num);
        }
        return list.size();
    }

    private int binarySearch(int num) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (list.get(mid) == num)  return mid;
            if (list.get(mid) < num) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }


}
