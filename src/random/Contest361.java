package random;

import java.util.*;

public class Contest361 {



    public long maxSum(List<Integer> nums, int m, int k) {

        Long result = 0L;
        Long tempSum = 0L;

        List<Integer> subList = nums.subList(0, k);
        for (int num : subList) {
            tempSum += num;
        }
        if(new HashSet<Integer>(subList).size() >= m) {
            result = Math.max(result, tempSum);
        }

        for (int i = 0; i < nums.size(); i++) {
            if(i + k <= nums.size()) {

                tempSum -= nums.get(0);
                tempSum += nums.get(i + k);

                subList.remove(0);
                subList.add(nums.get(i + k));

                if(new HashSet<Integer>(subList).size() >= m) {
                    result = Math.max(result, tempSum);
                }
            }
        }
        return result;

    }

    public boolean canBeEqual(String s1, String s2) {
        char[] chars = s1.toCharArray();

        if(s1.equals(s2)) {
            return true;
        }

        // case 1
        char temp = chars[0];
        chars[0] = s1.charAt(2);
        chars[2] = temp;

        if(s2.equals(new String(chars))) {
            return true;
        }
        chars = s1.toCharArray();

        // Case 2

        temp = chars[1];
        chars[1] = s1.charAt(3);
        chars[3] = temp;

        if(s2.equals(new String(chars))) {
            return true;
        }
        chars = s1.toCharArray();

        // Case 3

        temp = chars[0];
        chars[0] = s1.charAt(2);
        chars[2] = temp;

        temp = chars[1];
        chars[1] = s1.charAt(3);
        chars[3] = temp;

        if(s2.equals(new String(chars))) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Contest361 test = new Contest361();
//        System.out.println(test.maxSum(Arrays.asList(2, 6, 7, 3, 1, 7), 3, 4));
//        System.out.println("------------");
//        System.out.println(test.maxSum(Arrays.asList(5, 9, 9, 2, 4, 5, 4 ), 1, 3));
//        System.out.println("------------");


        int[] list = {996021492,996021492,973489433,66259330,554129007,713784351,646092981,328987029,469368828,685679486,66259330,165954500,731567840,595800464,552439059,14673238,157622945,521321042,386913607,733723177,330475939,462727944,69696035,958945846,648914457,627088742,363551051,50748590,400980660,674779765,439950964,613843311,385212079,725525766,813504429,385212079,66563232,578031878,935017574,554725813,456892672,245308625,626768145,270964388,554725813,768296675,676923124,939689721,115905765,625193590,717796816,27972217,277242430,768296675,480860474,659230631,570682291,601689140,955632265,767424000,251696645,675750691,767424000,251696645,767424000,675750691,675750691,251696645};

        List<Integer> temp = new ArrayList<>();
        for (int i : list) {
            temp.add(i);
        }


        System.out.println(test.maxSum(temp, 8, 8));
    }
}
