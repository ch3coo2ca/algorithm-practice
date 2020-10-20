package com.baekjoon.bfs;

import java.util.*;

public class Q1260 {
    public static ArrayList<Integer> [] list;
    public static boolean [] isVisited;

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        int startNode = sc.nextInt();

        list = new ArrayList[vertex+1];

        //init edges
        for(int i=1; i< vertex +1 ; i++) {
            list[i] = new ArrayList<Integer>();
        }

        //input edges
        for(int i=0; i<edge; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            list[v1].add(v2);
            list[v2].add(v1);
        }

        for(int i=1; i<vertex+1; i++ ) {
            Collections.sort(list[i]);
        }

        isVisited = new boolean[vertex+1];
        dfs(startNode);
        System.out.println();

        isVisited = new boolean[vertex+1];
        bfs(startNode);
        System.out.println();
    }

    private static void dfs(int node) {
        if(isVisited[node]) return;

        isVisited[node] = true; //visit node
        System.out.print(node + " ");
        for(int x : list[node]) {
            if(!isVisited[x]) dfs(x); //if the node is not visited, recursively call dfs of linked nodes
        }
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        isVisited[node] = true;


        while(!queue.isEmpty()) {
            int n = queue.poll();
            System.out.print(n + " ");
            for(int x : list[n]) {
                if(!isVisited[x]) {
                    isVisited[x] = true;
                    queue.add(x);
                }
            }
        }
    }

    public static void main(String[] args) {
        solution();

    }
}
