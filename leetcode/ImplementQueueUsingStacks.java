package com.leetcode;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1; //main stack
    Stack<Integer> stack2;
    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        while(!stack1.empty()) {
            int item = stack1.pop();
            stack2.push(item);
        }
        stack1.push(x);

        while(!stack2.empty()) {
            int item = stack2.pop();
            stack1.push(item);
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return stack1.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack1.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.empty();
    }
}

public class ImplementQueueUsingStacks {


    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        while(!obj.empty()) {
            System.out.println(obj.pop());
        }

    }

}
