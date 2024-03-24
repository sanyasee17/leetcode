package leetcode.LeetCode2483;

// https://leetcode.com/problems/minimum-penalty-for-a-shop/

public class MinimumPenaltyForAShop {


    // Not Optimised >> Time Limit Exceeds
    public int bestClosingTime(String customers) {

        if(!customers.contains("N")) {
            return customers.length();
        }

        if(!customers.contains("Y")) {
            return 0;
        }

        char[] chars = customers.toCharArray();
        int minHour = 0;
        int minPenalty = Integer.MAX_VALUE;

        int j = chars.length;
        while(j >= 0) {
            int penalty = 0;
            for (int i = 0; i < chars.length; i++) {
                if(j > i) {
                    if(chars[i] == 'N') {
                        penalty++;
                    }
                } else {
                    if(chars[i] == 'Y') {
                        penalty++;
                    }
                }
            }
            if(penalty <= minPenalty) {
                minPenalty = penalty;
                minHour = j;
            }
            j--;
        }
        return minHour;
    }

    // Optimised Solution >> Still Time Limit Exceeds
    public int bestClosingTimeOptimised(String customers) {

        if(!customers.contains("N")) {
            return customers.length();
        }

        if(!customers.contains("Y")) {
            return 0;
        }
        int minHour = 0;
        int minPenalty = Integer.MAX_VALUE;
        int j = customers.toCharArray().length;
        while(j >= 0) {
            int penalty = 0;
            String firstHalf = customers.substring(0, j);
            String secondHalf = customers.substring(j, customers.toCharArray().length);

            if(!firstHalf.isEmpty()) {
                penalty += firstHalf.chars().filter(ch -> ch == 'N').count();
            }

            if(!secondHalf.isEmpty()) {
                penalty += secondHalf.chars().filter(ch -> ch == 'Y').count();
            }

            if(penalty <= minPenalty) {
                minPenalty = penalty;
                minHour = j;
            }
            j--;
        }
        return minHour;
    }

    public int bestClosingTime2(String customers) {
        int penalty = customers.length();
        int closingHour = 0;
        int tempPenalty = penalty;

        for(int i = 1; i <= customers.length(); i++) {
            if(customers.charAt(i - 1) == 'Y') {
                tempPenalty--;
            }
            if(customers.charAt(i - 1) == 'N') {
                tempPenalty++;
            }
            if(tempPenalty < penalty) {
                penalty = tempPenalty;
                closingHour = i;
            }
        }

        return closingHour;
    }

    public static void main(String[] args) {

        MinimumPenaltyForAShop test = new MinimumPenaltyForAShop();

        System.out.println(test.bestClosingTime("YYNY"));

        System.out.println(test.bestClosingTime("YN"));

        System.out.println(test.bestClosingTimeOptimised("YYNY"));

        System.out.println(test.bestClosingTimeOptimised("YN"));

        System.out.println(test.bestClosingTime2("YYNY"));

        System.out.println(test.bestClosingTime2("YN"));

    }

}
