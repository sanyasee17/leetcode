package random;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biwikly113 {



    public int countPairs(List<List<Integer>> coordinates, int k) {

        int count = 0;
        for (int i = 0; i < coordinates.size(); i++) {
            for (int j = i + 1; j < coordinates.size(); j++) {
//                if((int) coordinates.get(i))
            }

        }
        return count;
    }

    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a + 1;
        }
        return 0;
    }

    public int minimumRightShifts(List<Integer> nums) {
        int i = 0;
        for (i = 1; i < nums.size() - 1; i++) {
            int num = nums.get(i);
            if(num < nums.get(i - 1) && num < nums.get(i + 1)) {
                // find pivot
                return nums.size() - i;
            }
        }
        if(i == nums.size() - 1) {
            return 0;
        }
        return -1;
    }


    public int minLengthAfterRemovals(List<Integer> nums) {

        if(nums.size() == 1) {
            return 1;
        }

//        int start = 0;
//        int end = nums.size() - 1;
//        while(true) {
//            if(nums.get(start) < nums.get(end)) {
//                start++;
//                end--;
//            }
//            else {
//                break;
//            }
//        }
//        return nums.size();
        int i = 0;
        int j = i + 1;
        while(j < nums.size() || i < nums.size()) {
            if(nums.get(i) < nums.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i;
    }

}
