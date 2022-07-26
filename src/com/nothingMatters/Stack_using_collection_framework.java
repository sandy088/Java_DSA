package com.nothingMatters;

import java.util.Stack;

public class Stack_using_collection_framework {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s2.push(s.pop());
        }

        while (!s2.isEmpty()){
            System.out.println(s2.peek());
           s2.pop();
        }
    }
}
