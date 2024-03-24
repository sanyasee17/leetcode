package leetcode.LeetCode168;

// https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {

        StringBuilder answer = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber --;
            answer.append( (char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle test = new ExcelSheetColumnTitle();
        System.out.println(test.convertToTitle(701));
    }
}
