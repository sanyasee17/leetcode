package random;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    List<String> result = new ArrayList<>();


    public List<String> getPermutation(String str) {
        backtrack(new StringBuilder(), str);
        return result;
    }

    private void backtrack(StringBuilder currentString, String mainString) {
        // Base Condition
        if(currentString.length() == mainString.length()) {
            // Found one result
            result.add(currentString.toString());
            return;
        }
        for(int i = 0; i < mainString.length(); i ++) {
            // Add with Condition
            if(currentString.toString().contains(String.valueOf(mainString.charAt(i)))) {
               continue;
            }
            currentString.append(mainString.charAt(i));
            // Explore
            backtrack(currentString, mainString);
            // Remove
            currentString.deleteCharAt(currentString.length() - 1);
        }
    }

    public static void main(String[] args) {
        Permutation test = new Permutation();
        System.out.println(test.getPermutation("abc"));
    }


}
