package dsa;

// https://leetcode.com/problems/robot-return-to-origin/

public class RobotMove {
    public static void main(String[] args) {
        String moves = "LL";

        System.out.println(judgeCircle(moves));
    }

    static boolean judgeCircle(String moves) {

        int[] positions = {0, 0};

        for (char move : moves.toCharArray()){
            switch (move) {
                case 'R' -> positions[1]++;
                case 'L' -> positions[1]--;
                case 'U' -> positions[0]--;
                case 'D' -> positions[0]++;
                default -> System.out.println("Invalid Move");
            }
        }
        return (positions[0] == 0) && (positions[1] == 0);
    }
}
