package dsa;

// https://leetcode.com/problems/excel-sheet-column-title/

public class ExcelColumnTitle {
    public static void main(String[] args) {

        String ans = convertToTitle(676);
        System.out.println(ans);
    }

    static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while(columnNumber > 0){
            int rem = columnNumber % 26;
            if(rem == 0){
                result.append("Z");
                columnNumber = columnNumber / 26 - 1;
            } else {
                result.append((char) ('A' + rem - 1));
                columnNumber = columnNumber / 26;
            }
        }
        return result.reverse().toString();
    }
}
