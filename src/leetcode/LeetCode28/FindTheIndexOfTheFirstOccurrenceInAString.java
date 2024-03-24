package leetcode.LeetCode28;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString test = new FindTheIndexOfTheFirstOccurrenceInAString();

        System.out.println(test.strStr("sadbutsad", "kjdsba"));
    }


}
