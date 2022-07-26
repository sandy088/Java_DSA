package com.nothingMatters;

public class MergeSort {

    public static void conquer(int arr[], int Si, int mid, int Ei){
        //creating a new array for storing sorted array
        int[] merged= new int[Ei-Si+1];


        int idx1= Si; //for tracking 1st half of array
        int idx2= mid+1; //for tracking 2nd half of array
        int x=0; //for tracking new merged array

        while(idx1<=mid && idx2 <=Ei){
            if (arr[idx1]<=arr[idx2]){
                merged[x++]= arr[idx1++];
            }
            else{
                merged[x++]= arr[idx2++];
            }
        }

        while(idx1<=mid){
            merged[x++]= arr[idx1++];
        }
        while(idx2<=Ei){
            merged[x++]= arr[idx2++];
        }

        for (int i=0,j=Si; i<merged.length;i++,j++){
            arr[j]= merged[i];
        }

    }

    public static void divide(int arr[], int Si, int Ei){
        if(Si>=Ei){
            return;
        }

        int mid= Si+(Ei-Si)/2;
         divide(arr,Si,mid);
         divide(arr,mid+1,Ei);
         conquer(arr,Si,mid,Ei);


    }

    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};
        int n= arr.length;

        divide(arr,0,n-1);

        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}