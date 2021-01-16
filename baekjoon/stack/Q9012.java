package com.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] strings = new String[T];

        for (int i = 0; i < T; i++) {
            strings[i] = sc.next();
        }

        for (int i = 0; i < T; i++) {
            String str = strings[i];

            stack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                Character ch = str.charAt(j);
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.size() < 1)  {
                        stack.push(ch);
                        break;
                    }
                    Character lastItem = stack.peek();
                    if (lastItem == '(') stack.pop();
                }
            }


            System.out.println(stack.size() > 0 ? "NO" : "YES");
        }


    }
}
