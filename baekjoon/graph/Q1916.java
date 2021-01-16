package com.baekjoon.graph;

import java.util.Arrays;
import java.util.Scanner;

public class Q1916 {

    //    public int dijkstra ( int v) {
//
//
//        return 0;
//    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //도시 개수
        int m = s.nextInt(); //버스 개수

        int[] distance = new int[n + 1];
        boolean[] isVisited = new boolean[n + 1];

        //거리는 최대값으로 초기화
        Arrays.fill(distance, Integer.MAX_VALUE);

        int[][] graph = new int[n + 1][n + 1];

        for(int [] arr : graph) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }

        for (int i = 0; i < m; i++) {
            int from = s.nextInt();
            int to = s.nextInt();
            int value = s.nextInt();
            graph[from][to] = Math.min(graph[from][to], value);
        }

        int start = s.nextInt();
        int end = s.nextInt();
        s.close();

        for (int i = 1; i <= n; i++) {
            distance[i] = graph[start][i];
            System.out.print(distance[i] + "\t");
        }


        isVisited[start] = true;


        for (int i = 1; i <= n; i++) {
            //방문하지 않은 노드 중 최소 값을 찾음
            int minDistance = Integer.MAX_VALUE;
            int minIndex = 1;
            for (int j = 1; j <= n; j++) {
                if (!isVisited[j] && distance[j] < minDistance) {
                    minDistance = distance[j];
                    minIndex = j;
                }
            }

            isVisited[minIndex] = true;

            for (int k = 1; k <= n; k++) {
                if (!isVisited[k]) {
                    distance[k] = Math.min(graph[minIndex][k] + distance[minIndex], distance[k]);
                }
            }

        }

        for (int i = 1; i <= n; i++) {
            System.out.print(distance[i] + "\t");
        }
        System.out.println();
        System.out.println(distance[end]);

    }
}
