package com.leetcode;

public class ReverseInteger {

    public static int reverse(long x) {
        boolean isMinus = x <0;
        String value = isMinus
                ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();

        if(Integer.MAX_VALUE < Long.parseLong(value)) {
            return 0;
        }else {
            return Integer.parseInt(value);
        }
    }

    public static void main(String[] args) {
//        reverse(9646324351);
    }
}
