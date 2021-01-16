package com.baekjoon.graph;

import java.util.Scanner;
import java.util.Stack;

/**
 * @see /www.acmicpc.net/problem/11780
 * Created by jylee on 2021-01-13
 */
public class Q11780 {

    public static int[][] map; //비용
    public static int[][] route; //중간경로 저장
    public static int INF = 100001;
    public static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        map = new int[n + 1][n + 1];
        route = new int[n + 1][n + 1];


        //비용 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                route[i][j] = INF;
                if (i == j) map[i][j] = 0;
                else map[i][j] = INF;
            }
        }

        for (int i = 0; i < m; i++) {
            int start = s.nextInt();
            int end = s.nextInt();
            int cost = s.nextInt();
            map[start][end] = Math.min(map[start][end], cost);
            route[start][end] = start;
        }

        //중간점
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {  //시작
                if (k == i) continue;
                for (int j = 1; j <= n; j++) { //도착
                    if (k == j || i == j) continue;
                    if (map[i][k] + map[k][j] < map[i][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                        route[i][j] = route[k][j];

                    }
                }
            }
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (route[i][j] == INF) {
                    sb.append(0 + "\n");
                } else {
                    stack = new Stack<>();
                    int pre = j;
                    stack.push(j);
                    while (i != route[i][pre]) { // i ~ 에서 pre(거쳐간곳)
                        pre = route[i][pre];
                        stack.push(pre);
                    }

                    sb.append(stack.size() + 1 + " "); //시작점(+1)
                    sb.append(i + " "); //시작점 출력
                    while (!stack.empty()) {
                        sb.append(stack.pop() + " ");
                    }

                    sb.append("\n");
                }

            }
        }
        System.out.println(sb.toString());
    }
}
