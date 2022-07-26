package com.nothingMatters;

class Base{

    private int a;
    int b;

    public void print(int a){
        this.a=a;
        System.out.println(a);
    }
}

class child extends Base{

}

public class inheritance {
    public static void main(String[] args) {
        child c1= new child();
        c1.print(5);
    }
}
