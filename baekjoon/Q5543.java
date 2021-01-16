package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burgers [] = new int[3];
        int drinks [] = new int[2];

        for(int i =0; i<3; i++){
            burgers[i] = Integer.parseInt(br.readLine());
        }

        for(int j=0; j<2; j++) {
            drinks[j] = Integer.parseInt(br.readLine());
        }

        int minBurger = burgers[0];
        if(burgers[1] < minBurger) {
            minBurger = burgers[1];
            if(burgers[2] < burgers[1]) {
                minBurger = burgers[2];
            }
        }
        if(burgers[2] < minBurger) minBurger = burgers[2];

        int minDrink = (drinks[0] < drinks[1] ? drinks[0] : drinks[1]);

        System.out.println(minBurger + minDrink - 50);

    }
}
