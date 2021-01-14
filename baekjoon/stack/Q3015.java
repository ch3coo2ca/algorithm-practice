package com.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @see /www.acmicpc.net/problem/3015
 * Created by jylee on 2021-01-13
 */
public class Q3015 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Pair> stack = new Stack<>();
        long total = 0;


        for (int i = 0; i < n; i++) {
            int height = s.nextInt();
            Pair pair = new Pair(height, 1);
            while (!stack.isEmpty()) {
                //stack의 top보다 현재 키가 더 크면 , 현재 이후는 top을 볼 수 없다.
                if (stack.peek().height <= pair.height) {
                    total += stack.peek().count;
                    if (stack.peek().height == pair.height) {
                        pair.count += stack.peek().count;
                    }
                    stack.pop();
                } else {
                    break;
                }

            }
            if (!stack.isEmpty()) { //top이 현재 키 볼 수 있음
                total += 1;

            }

            stack.push(pair);

        }
        System.out.println(total);

    }
}

class Pair {
    int height;
    int count;

    public Pair(int height, int count) {
        this.height = height;
        this.count = count;
    }
}