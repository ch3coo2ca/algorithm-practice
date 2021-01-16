package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String nums = br.readLine();
        int length = Integer.parseInt(nums.split(" ")[0]);
        int max = Integer.parseInt(nums.split(" ")[1]);

        String arrs [] = br.readLine().split(" ");
        if(arrs.length > length || arrs.length < length) return;

        for(int i=0; i<arrs.length; i++) {
            if(Integer.parseInt(arrs[i]) < max) {
                sb.append(arrs[i]+" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
