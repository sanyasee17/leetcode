package jul_22;

// 1678. Goal Parser Interpretation
// https://leetcode.com/problems/goal-parser-interpretation/

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";

        String answer = interpret(command);

        System.out.println(answer);
    }

    static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if(command.charAt(i) == '('){
                if(i < command.length() - 1 && command.charAt(i + 1)  == ')'){
                    sb.append('o');
                    i = i + 2;
                } else {
                    sb.append("al");

                    i = i + 4;
                }
            } else {
                sb.append(command.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
