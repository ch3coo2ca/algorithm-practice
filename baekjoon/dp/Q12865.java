package com.baekjoon.dp;

import java.util.Scanner;

/**
 * @see /www.acmicpc.net/problem/12865
 * Created by jylee on 2020-11-16
 */
public class Q12865 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt(); //max weight
        int [][] dp = new int[N+1][K+1];
        int [] w = new int[N+1];
        int [] v = new int[N+1];


        //무게, 가치를 각각 배열에 넣음
        for(int i=1; i<=N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=K; j++) { //무게
                dp[i][j] = dp[i-1][j]; //이전에 담았던 값을 넣음
                if(j - w[i]  >=0) { //남은 무게가 있다면
                    //이전에 담았던 값 , 남은무게의 가치 값 + 현재 가치 값 중 큰값
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
