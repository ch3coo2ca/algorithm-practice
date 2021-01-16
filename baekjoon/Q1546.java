package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String scores = br.readLine();

        float arr []  = new float[num];
        int idx =0;
        StringTokenizer st = new StringTokenizer(scores," ");
        while(st.hasMoreTokens()) {
            float s = Float.parseFloat(st.nextToken());
            arr[idx++] = s;
        }

        Arrays.sort(arr);
        float max = arr[num-1];
        float total = 0;

        for(int i =0; i<num; i++) {
            total = total +  (arr[i]/max * 100);
        }
        System.out.println(total/num);
    }
}
