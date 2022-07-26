package com.nothingMatters;

class mThread extends Thread{

   
    @Override
    public void run() {

        for (int i=0; i<100;i++){
        System.out.println("I am Thread 1");

        }
    }
}

class mThread2 extends  Thread{

    @Override
    public void run() {

        for(int i=0; i<100; i++){
        System.out.println("I am Thread 2");}

    }
}

public class multiThreading {


    public static void main(String[] args) {
        mThread t1= new mThread();
        mThread2 t2= new mThread2();

        t1.start();
        t2.start();
    }
}
