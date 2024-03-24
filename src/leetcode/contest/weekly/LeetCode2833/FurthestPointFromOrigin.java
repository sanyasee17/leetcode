package leetcode.contest.weekly.LeetCode2833;

// Contest 360
// https://leetcode.com/contest/weekly-contest-360/problems/furthest-point-from-origin/
public class FurthestPointFromOrigin {

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
