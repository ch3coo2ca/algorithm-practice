package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for(int i=0; i<size; i++){
           String ex = br.readLine();
            int total = 0;
            int score = 0;
            for(int j=0; j <ex.length(); j++) {
                char c = ex.charAt(j);
                if(c == 'O') {
                    score ++;
                }else {
                    score =0;
                }
                total+=score;

            }
            System.out.println(total);
        }
    }
}
