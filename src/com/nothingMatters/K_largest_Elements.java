package com.nothingMatters;



public class K_largest_Elements {

    public static int partition(int[] arr, int low, int high){
        int pivot= arr[high];
        int i= low-1;

        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]= pivot;
        arr[high]= temp;
        return i;
    }

    public static void quickSort(int[] arr,int low, int high){

        if(low<high){
            int pivdx= partition(arr,low,high);

            quickSort(arr,low,pivdx-1);
            quickSort(arr,pivdx+1,high);
        }
    }

    public static void shoInverse(int[] arr,int K){
        int n= arr.length-1;
        for (int j=n; j>n-K;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {12,5,787,1,23};
        int n=  arr.length;
        quickSort(arr,0,n-1);

        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        shoInverse(arr,2);
    }
}
