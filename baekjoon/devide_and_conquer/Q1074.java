package com.baekjoon.devide_and_conquer;

import java.util.Scanner;

public class Q1074 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int r = s.nextInt();
        int c = s.nextInt();

        N = (int) Math.pow(2, N);
        //기준 좌표
        int x = 0;
        int y = 0;

        int count = 0;
        while (N > 1) {
            N = N / 2; //반으로 쪼갠다

            //몇 사분면인지 검사
            if (r < x + N && c < y + N) {
                //스킵
            } else if (r < x + N && y + N <= c) {
                count += N * N * 1; //1사분면 영역 수 만큼 탐색 개수에 추가
                y += N; //기준 좌표 변경
            } else if (x + N <= r && c < y + N) {
                count += N * N * 2; //1,2 사분면 영역 수
                x += N;
            } else {
                count += N * N * 3; //1,2,3 사분면 영역 수
                x += N;
                y +=N;
            }
        }

        System.out.println(count);

    }
}
