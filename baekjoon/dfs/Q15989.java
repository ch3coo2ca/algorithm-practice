package com.baekjoon.dfs;

import java.util.Scanner;

public class Q15989 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[10001][4];
        int T = sc.nextInt();

        dp[1][1] = 1;
        dp[1][2] = 0;
        dp[1][3] = 0;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[2][3] = 0;
        dp[3][1] = 1; //왜 2가아닌지..?
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 10000; i++) {
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.print(dp[N][1] + dp[N][2] + dp[N][3] + "\n");
        }

    }
}

