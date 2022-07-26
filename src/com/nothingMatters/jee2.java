package com.nothingMatters;
import java.util.*;

public class jee2 {

    static void swapAlternate(List<Integer> list, int size){
        for (int i=0; i<size;i+=2){
            if (list.get(i + 1) <size){
                Collections.swap(list,i,i+1);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int n= arr.length;
        List<Integer> list = Arrays.asList(44, 55, 99, 77, 88, 66);
//        for(int i=0; i< n-1;i+=2){
//            if(arr[i+1]<n){
//               int temp= arr[i];
//               arr[i]= arr[i+1];
//               arr[i+1]= temp;
//
//            }
//        }
        swapAlternate(list,n);

        int i=0;
        while(i<=n-1){
            System.out.print(list.get(i) +" ");
            i++;
        }
    }
}
