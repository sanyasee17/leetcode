package random;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contest363 {


    int result = 0;
    List<Integer> nums;

    public static void main(String[] args) {
        Contest363 test = new Contest363();
        System.out.println(test.countWays(List.of(1, 1)));
    }
    public int countWays(List<Integer> nums) {
        this.nums = nums;
        backtrack(new HashSet<>(), 0);

        return result;
    }

    void backtrack(Set<Integer> current, int index) {

        for(int i = 0; i < nums.size(); i++) {
            if(!current.contains(i)) {
//                result++;
                current.add(nums.get(i));
                backtrack(current, i + 1);
                current.remove(current.size() - 1);
            }

        }

        if(isHappy(current)) {
            result++;
            return;
        }
    }

    boolean isHappy(Set<Integer> current) {
//        boolean selected = (current.size() + 1) > nums.get(j);

        for(int i = 0; i < nums.size(); i++) {
            if(!current.contains(i)) {
                // Non Selected
                if(!((current.size()) < nums.get(i))) {
                    return false;
                }
            } else {
                // Selected
                if(!((current.size()) > nums.get(i))) {
                    return false;
                }
            }
        }

        return true;
    }


    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(Integer.toBinaryString(i).replaceAll("0", "").length() == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
