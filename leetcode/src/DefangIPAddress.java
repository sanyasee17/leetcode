package com.sanyasee.leetcode.java;

// 1108. Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/

public class DefangIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(char ch : address.toCharArray()){
            if(ch == '.'){
                sb.append('[');
                sb.append(ch);
                sb.append(']');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
