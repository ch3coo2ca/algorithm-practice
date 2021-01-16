package com.leetcode;

public class HappyNumber {

    public static boolean isHappy(int n) {
        boolean isHappy = false;

        while(!isHappy) {
            String nums []  = String.valueOf(n).split("");
            n=0;
            for(int i=0; i<nums.length; i++) {
                n += Math.pow(Integer.valueOf(nums[i]),2);
            }
            if(n == 1) isHappy = true;
        }
        return isHappy;
    }
    public static void main(String[] args) {
        boolean res = isHappy(2);
        System.out.println(res);
    }
}
