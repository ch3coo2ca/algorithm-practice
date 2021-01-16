package com.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @see /www.acmicpc.net/problem/2178
 * Created by jylee on 2020-10-26
 */
public class Q2178 {

    public static int N, M;
    public static int[][] map;
    public static boolean[][] isVisited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static class Coords {
        int x;
        int y;

        Coords(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(int x , int y ) {
        //store adjacent x,y coords in queue
        Queue<Coords> queue = new LinkedList<>();

        queue.add(new Coords(x,y));
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            Coords coords = queue.poll();
            int tempX = coords.x;
            int tempY = coords.y;

            //search quadrant areas of current coords
            for (int j = 0; j < 4; j++) {
                int nx = tempX + dx[j];
                int ny = tempY + dy[j];

                //check if coords is valid
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                        isVisited[nx][ny] = true;
                        queue.add(new Coords(nx, ny));

                        //put number of movements used from starting position(x,y)
                        map[nx][ny] = map[tempX][tempY] + 1;
                    }
                }
            }
        }
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

        bfs(0,0);

        System.out.println(map[N-1][M-1]);
    }


}
