package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            int remainder = num % 42;
            if(map.containsKey(remainder)) {
                int val = map.get(remainder);
                map.put(remainder,val+1);
            }else {
                map.put(remainder,1);
            }
        }
        System.out.println(map.size());
    }
}
