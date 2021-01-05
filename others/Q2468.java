package com.baekjoon.others;

import java.util.Scanner;

public class Q2468 {

    public static int N;
    public static int[][] area;
    public static boolean[][] isVisited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static int dfs(int i, int j, int max) {
        isVisited[i][j] = true;

        // i,j 기준으로 상하좌우를 탐색한다
        for (int k = 0; k < 4; k++) {
            int x = dx[k] + i;
            int y = dy[k] + j;

            if (x >= 0 && y >= 0 && x < N && y < N) {
                if (area[x][y] > max && !isVisited[x][y]) {
                    dfs(x, y, max);
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        area = new int[N][N];
        isVisited = new boolean[N][N];

        //지역정보 입력받음
        int max = 0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int num = s.nextInt();
                area[i][j] = num;
                if (max == 0 || max < num) max = num;
                if (min == 0 || num < min) min = num;
            }
        }

        int maxCount = 0;
        int count = 0;
        for (int k = min; k <= max; k++) {
            count = 0;

            isVisited = new boolean[N][N];
            // 높이 k 이하인 영역은 잠김
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (k < area[i][j] && !isVisited[i][j])
                        count += dfs(i, j, k);
                }
            }

            maxCount = Math.max(maxCount, count);
            if (max == 1) maxCount = 1;

        }

        System.out.println(maxCount);

    }
}
