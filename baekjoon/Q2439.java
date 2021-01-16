package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        long  start  = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for(int i =0; i<size; i++) {
            for(int j =1; j < size-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        br.close(); 
    }
}
