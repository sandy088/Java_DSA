package com.nothingMatters;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        //Add elements
//        list.add(25);
//        list.add(35);
//        list.add(5);
//        list.add(65);list.add(25);list.add(25);

        //with Loops
        for (int i=1; i<=10;i++){

            list.add(i);
        }


        System.out.println(list);

        //Get elements

        for (int i=9;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //Insert element in between

        list.add(0,55);
        System.out.println(list);

        //Set element
        list.set(10,100);
        System.out.println(list);

        //Delete Element
        list.remove(5);
        System.out.println(list);

        //size of ArrayList
        System.out.println("Size of Array List is: "+list.size());

        //Sorting in ArrayList
        Collections.sort(list);
        System.out.println(list);
    }
}
