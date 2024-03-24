package random;

import java.util.ArrayList;
import java.util.List;

public class SubsetTest {

    List<Integer> list;
    List<List<Integer>> result = new ArrayList<>();


    public static void main(String[] args) {
        SubsetTest test = new SubsetTest();
        test.getSubset(List.of(1, 2, 3, 4, 5));
    }



    List<List<Integer>> getSubset(List<Integer> list) {
        this.list = list;
        backTrack(0, new ArrayList<>());
        return result;
    }

    void backTrack(int currentIndex, List<Integer> currentList) {

        // Base
        System.out.println(currentList);

        for (int i = currentIndex; i < list.size(); i++) {

            currentList.add(list.get(i));
            backTrack(i + 1, currentList);
            currentList.remove(currentList.size() - 1);

        }

    }
}
