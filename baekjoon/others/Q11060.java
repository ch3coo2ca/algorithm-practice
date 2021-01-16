package com.baekjoon.others;

import java.util.Scanner;

public class Q11060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int[] visit = new int[N];

        if (N == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            visit[i] = -1; //방문하지 않은 곳은 -1로 초기화
        }

        //점프 시작하는 곳은 방문횟수 0에서 시작
        visit[0] = 0;

        for (int i = 0; i < N; i++) {

            //이전에 거치지 않은곳은 출발점이 될 수 없다
            if(visit[i] == -1){
                continue;
            }

            //nums[i]에 쓰인 숫자만큼 이동 할 수 있음
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < N) {
                    if (visit[i + j] == -1) { //점프 할 곳이 방문한 적이 없다면 점프해서 이동.
                        visit[i + j] = visit[i] + 1;
                    } else {
                        //이미 방문된 곳이라면, 이전에 방문했을때랑 이번에 방문했을 때 숫자 중 작은것 반환
                        visit[i + j] = Math.min(visit[i + j], visit[i] + 1);
                    }
                }

            }
        }

        System.out.println(visit[N - 1]);


    }
}
