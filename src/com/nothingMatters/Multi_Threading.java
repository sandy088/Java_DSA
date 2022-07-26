package com.nothingMatters;

class dThread implements Runnable{
    public int i=0;
    public void run(){
        while(i<=100){
        System.out.println("I am Thread1");
        i++;
        }
    }
}

class tThread implements Runnable{
    public
    int i=0;
    @Override
    public void run() {
        while(i<=100){
            System.out.println("I am Thread2");
            i++;
        }
    }
}

public class Multi_Threading {

    public static void main(String[] args) {
        dThread b1= new dThread();
        Thread g1= new Thread(b1);

        tThread b2= new tThread();
        Thread g2= new Thread(b2);

        g1.start();
        g2.start();
    }
}
