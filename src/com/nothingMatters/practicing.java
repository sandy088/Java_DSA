package com.nothingMatters;
import java.util.Scanner;

import java.util.Arrays;

public class practicing {

    public static int kthSmaalest(int arr[],int k){
        Arrays.sort(arr);
        for (int i=0; i< arr.length;i++){
            if (i== k-1){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //kth smallest element in array
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter kth element");
        int k= sc.nextInt();

        System.out.println(kthSmaalest(arr,k));




    }
}
