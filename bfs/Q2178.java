package com.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2178 {

    public static int N, M;
    public static int[][] map;
    public static boolean[][] isVisited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int count = 1;

    public static int bfs(int x, int y) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(map[x][y]);
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            int n = queue.poll();

            for (int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                if (nx >= 0 && ny >= 0 && nx <= N && ny <= M) {
                    if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                        isVisited[nx][ny] = true;
                        queue.add(map[nx][ny]);
                    }
                }
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = row.charAt(j) - '0';
            }
        }

        bfs(0, 0);

    }
}
