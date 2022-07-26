package com.nothingMatters;
import  java.util.*;

import java.util.LinkedList;

public class LL_Collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();

        list.addFirst("Hello");
        list.addLast("I am Sandy");
        list.remove(1);
        System.out.println(list);
    }
}
