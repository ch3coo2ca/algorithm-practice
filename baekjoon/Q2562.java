package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 9;
            String nums [] = new String[size];

            for(int i=0; i<9; i++) {
                nums[i] = br.readLine();
                if(nums[i].equals("") || nums[i] == null) return;
            }

            int max = Integer.parseInt(nums[0]);
            int idx = 1;
            for(int i=0; i<9; i++) {
                int num = Integer.parseInt(nums[i]);
            if(max < num) {
                max = num;
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
