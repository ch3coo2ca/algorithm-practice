package com.baekjoon.others;

import java.util.Scanner;

public class Q11404 {

    private static final int INF = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // city
        int m = sc.nextInt(); // bus

        int[][] costs = new int[n + 1][n + 1];

        sc.nextLine();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) costs[i][j] = 0;
                else costs[i][j] = INF;
            }
        }

        //초기화
        for (int i = 0; i < m; i++) {
            String[] str = sc.nextLine().split("\\s+");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            int cost = Integer.parseInt(str[2]);

            // 기존비용과 현재비용 중 최소값을 넣음
            costs[start][end] = Math.min(costs[start][end], cost);
        }


        for (int i = 1; i <= n; i++) { //시작
            for (int j = 1; j <= n; j++) { //도착
                if (i == j) continue; //시작 == 도착
                int currentCost = costs[i][j];

                for (int k = 1; k <= n; k++) { //경유
                    if (i == k ||  j == k) continue; //시작 == 경유 , 경유 == 도착

                    int transitCost = costs[i][k] + costs[k][j]; //경유비용
                    costs[i][j] = Math.min(currentCost, transitCost);
                }
            }
        }

        for (int i = 1; i < costs.length; i++) {
            for (int j = 1; j < costs.length; j++) {
                if (costs[i][j] == INF) System.out.print("0 ");
                else System.out.print(costs[i][j] + " ");
            }
            System.out.println();
        }

    }
}
