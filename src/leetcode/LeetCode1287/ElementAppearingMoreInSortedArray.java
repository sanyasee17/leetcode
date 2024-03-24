package leetcode.LeetCode1287;

import java.util.HashMap;

public class ElementAppearingMoreInSortedArray {

    public static void main(String[] args) {
        ElementAppearingMoreInSortedArray test = new ElementAppearingMoreInSortedArray();
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(test.findSpecialInteger(arr));
    }

    public int findSpecialInteger(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }

        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (Integer key : hashMap.keySet()) {
            if(hashMap.get(key) > max) {
                max = hashMap.get(key);
                ans = key;
            }
        }
        return ans;
    }

    // Remove one for loop, do it using one for loop
    // Use the point for 25% means 1/4
    public int findSpecialInteger2(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int temp = arr.length / 4;
        for (int i = 0; i < arr.length - temp; i++) {
            if (arr[i] == arr[i + temp]) { // this is for sure because array is sorted
                return arr[i];
            }
        }

        return 0;
    }

}
