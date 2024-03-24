package random;

import java.util.*;


// Contest 360
public class App {




//    public long getMaxFunctionValue(List<Integer> receiver, long k) {
//        long max = 0;
//        for (int i = 0; i < receiver.size(); i++) {
//            max = Math.max(max, calculateSum(i, receiver, k));
//        }
//        return max;
//    }

    private long calculateSum (int id, List<Integer> receiver, long k) {
        long sum = id;
        for (int i = 1; i <= k; i++) {
            sum += receiver.get(1);
        }
        return sum;
    }


    public long minimumPossibleSum(int n, int target) {

        HashSet<Integer> resultSet = new HashSet<>();
        int i = 1;
        while(resultSet.size() != n) {
            if(!resultSet.contains(target - i)) {
                resultSet.add(i);
            }
            i++;
        }

        System.out.println(resultSet);
        return resultSet.stream().reduce(0, (a, b) -> a + b);


//        List<Integer> resultarray = new ArrayList<>();
//        int i = 1;
//        while(resultarray.size() != n) {
//            if(!checkForTargetIsMatchingOrNot(resultarray, i, target)) {
//                resultarray.add(i);
//            }
//            i++;
//        }
//        System.out.println(resultarray);
//        return resultarray.stream().reduce(0, (a, b) -> a + b);
    }

    private boolean checkForTargetIsMatchingOrNot(List<Integer> resultArray, int newNum, int target) {
        for (Integer num : resultArray) {
            if(num + newNum == target) {
                return true;
            }
        }
        return false;
    }


    public long getMaxFunctionValue(List<Integer> receiver, long k) {

        int sender;
        long ans = 0;
        long currentSum = 0;

        for (sender = 0; sender < receiver.size(); sender++) {
            int n = sender;
            currentSum = n;
            for (long i = 1; i <= k; i++) {
                currentSum += receiver.get(n);
                n = receiver.get(n);
            }
            System.out.println(currentSum);
            ans = Math.max(ans, currentSum);

        }
        return ans;
    }

    public static void main(String[] args) {
        App test = new App();

//        System.out.println(test.minimumPossibleSum(16, 6));

        System.out.println(test.getMaxFunctionValue(Arrays.asList(2, 0, 1), 4));
    }



    public int furthestDistanceFromOrigin(String moves) {

        int result = 0;
        int countL = 0;
        int countR = 0;
        int count_ = 0;

        for (char ch : moves.toCharArray()) {
            if(ch == 'L') {
                countL++;
            }
            else if(ch == 'R') {
                countR++;
            } else {
                count_++;
            }
        }

        if (countL > countR) {
            return (countL + count_ - countR);
        } else {
            return (countR + count_ - countL);
        }

    }
}
