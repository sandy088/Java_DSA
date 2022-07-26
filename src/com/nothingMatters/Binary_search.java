package com.nothingMatters;

public class Binary_search {

    public static int BS(int i, int j, int k, int[] arr){
        int mid= (i+j)/2;

        if(arr[mid]==k){
            System.out.println(mid);
            return mid;
        }

        if (arr[mid]>k){
            BS(i,mid-1,k,arr);
        }
        else{
            BS(mid+1,j,k,arr);
        }
        return mid;

    }

    public static void main(String[] args) {
        int [] arr= {1,5,10,12,40,60,70};

        BS(1,7,60,arr);
    }
}
