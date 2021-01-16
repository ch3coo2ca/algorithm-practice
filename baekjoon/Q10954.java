package com.baekjoon;

import java.io.IOException;
import java.util.Scanner;
public class Q10954 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(s.hasNextInt()) {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            sb.append(num1+num2+"\n");
        }
        System.out.println(sb);
    }
}
