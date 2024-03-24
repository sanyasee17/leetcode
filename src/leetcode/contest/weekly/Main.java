package leetcode.contest.weekly;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer.toBinaryString(1);

        int[] arr = {5,5,5,5,5};

        System.out.println(minimumArrayLength(arr));
    }

    public boolean canSortArray(int[] nums) {
        int[] setBitCountList = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        for(int num : nums) {
            setBitCountList[j++] = Integer.toBinaryString(num).replaceAll("0", "").length();
        }

        while(i < setBitCountList.length) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while(i < setBitCountList.length && setBitCountList[i] == setBitCountList[i]) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
                i++;
            }
            list.add(min);
            list.add(max);
        }
        for(int k = 1; k < list.size(); k++) {
            if(list.get(k) < list.get(k - 1)) {
                return false;
            }
        }

        return true;
    }

    public int minimumCost(int[] nums) {

        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                sum += nums[i];
            }
            queue.add(nums[i]);
        }
        sum += queue.poll();
        sum += queue.poll();
        return sum;
    }


    public static int minimumArrayLength(int[] nums) {

        Arrays.sort(nums);

//        int i = nums.length - 1;
//        while(i > 0) {
//            if(nums[i] != 0) {
//                nums[i - 1] = nums[i - 1] % nums[i];
//                nums[i] = -1;
//            }
//            i--;
//        }

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            if(nums[start] == 0) {
                start++;
                continue;
            }
            nums[start] = nums[start] % nums[end];
            nums[end] = -1;
            end--;
        }

        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != -1){
                count++;
            }
        }

        return count;
    }
}
