package Jan_23;

import java.util.HashMap;

// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/

public class MinRoundToCompleteTask {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(arr));
    }

    public static int minimumRounds(int[] tasks) {
        if(tasks.length == 0 || tasks.length == 1) {
            return -1;
        }

        HashMap<Integer, Integer> hashMap = new HashMap();
        int round = 0;
        for(int num : tasks) {
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        for(int value: hashMap.values()) {
            if(value == 1) {
                return -1;
            } else {
                round += value/3;
                if(value % 3 != 0) {
                    round++;
                }
            }
        }
        return round;
    }
}
