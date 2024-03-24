package random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/contest/weekly-contest-362/

public class Contest362 {


    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        int minSteps = 0;
        minSteps = Math.max(Math.abs(sx - fx), Math.abs(sy - fy));
        if(minSteps == 0 && t == 1) {
            return false;
        }
        return t >= minSteps;
    }


    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();

        for (List<Integer> items : nums) {
            set.addAll(IntStream.rangeClosed(items.get(0), items.get(1))
                    .boxed()
                    .collect(Collectors.toSet()));
        }
        return set.size();
    }

    public static void main(String[] args) {

        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(3, 6));
        nums.add(List.of(1, 5));
        nums.add(List.of(4, 7));

        Contest362 test = new Contest362();

        System.out.println(test.numberOfPoints(nums));


        System.out.println(test.isReachableAtTime(2, 1, 1, 4, 2));

    }
}
