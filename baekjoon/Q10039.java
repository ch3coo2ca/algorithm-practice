package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10039 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        for(int i=0; i<5; i++){
            int score = Integer.parseInt(br.readLine());
            if(score < 40) score = 40;
            total += score;
        }

        System.out.println(total/5);

    }
}
