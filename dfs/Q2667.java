package com.baekjoon.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2667 {

    public static int [][] aparts;
    public static boolean [][] isVisited;
    public static int [] dx = {-1,1,0,0};
    public static int [] dy = {0,0,-1,1};
    public static int N;
    public static int total = 0; //total number of groups
    public static ArrayList<Integer> houses = new ArrayList<>();

    /**
     * @description search for adjacent nodes
     * @param x
     * @param y
     */
    public static int search(int x, int y ) {

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            //check coordinate range
            if(nx >=0 && ny >= 0 && nx < N && ny < N) {
                if(!isVisited[nx][ny] && aparts[nx][ny] ==1 ) {
                    isVisited[nx][ny] = true;
                    search(nx, ny);
                    total++;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        aparts = new int[N][N];
        isVisited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            String row = sc.next();
            for(int j=0; j<N; j++) {
                aparts[i][j] = row.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!isVisited[i][j] && aparts[i][j] == 1) {
                    isVisited[i][j] = true;
                    total = 1;
                    search(i,j);
                    houses.add(total);
                }
            }
        }

        System.out.println(houses.size());
        Collections.sort(houses);

        for(int i=0; i<houses.size(); i++){
            System.out.println(houses.get(i));
        }
    }
}
