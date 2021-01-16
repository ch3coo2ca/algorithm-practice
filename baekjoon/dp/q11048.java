package com.baekjoon.dp;

import java.util.Scanner;

public class q11048 {
    public static int [][] maze;
    public static int [][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        maze = new int[N+1][M+1];
        dp = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                maze[i][j] = Integer.parseInt(sc.next());
            }
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                dp[i][j] = maze[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        System.out.println(dp[N][M]);
    }
}
