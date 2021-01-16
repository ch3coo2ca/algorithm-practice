package com.baekjoon;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Q11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        char c = s.charAt(0);


        int ascii = Integer.valueOf(c);

        System.out.print(ascii);
    }
}
