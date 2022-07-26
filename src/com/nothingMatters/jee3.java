package com.nothingMatters;
import java.util.Scanner;

public class jee3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] N= new int[5];
        for (int i=1;i<5;i++){
            N[i]= sc.nextInt();
        }
        for (int i=0; i<N.length;i++){
        System.out.print(N[i]+" ");}
    }
}
