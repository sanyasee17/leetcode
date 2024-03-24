package leetcode.LeetCode997;

// https://leetcode.com/problems/find-the-town-judge

import java.util.HashMap;
import java.util.HashSet;

public class FindTheTownJudge {

    public static void main(String[] args) {

        FindTheTownJudge test = new FindTheTownJudge();
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        System.out.println(test.findJudge(4, trust));
    }

    public int findJudge(int n, int[][] trust) {

        if(trust.length == 0 && n == 1) {
            return n;
        }

        HashSet<Integer> peopleSet = new HashSet<>();
        HashMap<Integer, Integer> judgeTrustCount = new HashMap();

        for(int i = 0; i < trust.length; i++) {

            peopleSet.add(trust[i][0]);
            judgeTrustCount.put(trust[i][1], judgeTrustCount.getOrDefault(trust[i][1], 0) +1);

        }

        System.out.println(peopleSet);
        System.out.println(judgeTrustCount);

        for (Integer key : judgeTrustCount.keySet()) {
            if(judgeTrustCount.get(key) == n - 1 && !peopleSet.contains(key)) {
                return key;
            }
        }

        return -1;

    }
}
