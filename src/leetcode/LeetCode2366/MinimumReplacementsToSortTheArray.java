package leetcode.LeetCode2366;

// https://leetcode.com/problems/minimum-replacements-to-sort-the-array/


public class MinimumReplacementsToSortTheArray {

    public long minimumReplacement(int[] nums) {

        long result = 0l;
        int length = nums.length;

        for (int i = length - 2; i >= 0; i--) {

            if(nums[i] <= nums[i + 1]) {
                continue;
            }

            // Think how we break the current Number so that the break parts will be equal or less than next element
            int[] replacement = calculateReplacement(nums[i], nums[i + 1]);

            result += replacement[0];
            nums[i] = replacement[1];

        }

        return result;
    }

    private int[] calculateReplacement(int current, int next) {

        int operationCount = 0;
        int previousCurrent = 0;

        int ans = current / next;

        if(current % next == 0) {
            // In This case current is divisible by next so,
            // We will divide by next then we will get the value of break part
            // Think if we divide into 2 parts, means we divide once same here apply
            operationCount = ans - 1;
            previousCurrent = current / ans;
        } else {
            // In this case, as not divisible, and now we know we have to divide it by plus times more
            // we will get the min break value
            operationCount = ans;
            previousCurrent = current / (ans + 1);
        }

        return new int[] {operationCount, previousCurrent};

    }

    public static void main(String[] args) {

        MinimumReplacementsToSortTheArray test = new MinimumReplacementsToSortTheArray();
        int[] nums = {3, 9, 3};
        System.out.println(test.minimumReplacement(nums));

    }

}
