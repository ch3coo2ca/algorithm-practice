package com.baekjoon.others;

import java.util.Scanner;

/**
 * @see  /www.acmicpc.net/problem/14719
 * Created by jylee on 2020-11-24
 */
public class Q14719 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int W = s.nextInt();

        int arr [] = new int [W];
        int count =0;
        for(int i=0; i<W; i++) {
            arr[i] = s.nextInt(); //각 열의 벽 크기
        }

        for(int i=1; i<W-1; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];

            //leftMax 찾기
            for(int j = i-1; j>=0; j--) {
                if(arr[j] > arr[i])  leftMax = Math.max(leftMax, arr[j]);
            }

            for(int k = i+1; k <W; k++) {
                if(arr[k] > arr[i]) rightMax = Math.max(rightMax, arr[k]);
            }

            if(Math.min(leftMax,rightMax) > arr[i]) {
            count += (Math.min(leftMax,rightMax) - arr[i]);
            }
        }

        System.out.println(count);
    }
}
