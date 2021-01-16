package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.parseInt(br.readLine());
            for(int i = 0; i<size; i++) {
                System.out.println(i+1);
            }
    }
}
