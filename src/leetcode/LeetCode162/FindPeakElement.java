package leetcode.LeetCode162;

public class FindPeakElement {

    public static void main(String[] args) {

        FindPeakElement test = new FindPeakElement();

        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(test.findPeakElement(arr));
    }

    public int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        System.out.println(start + " : " + end);
        return start;
    }
}
