package com.nothingMatters;

public class jee4 {
    public static void main(String[] args) {
        int[] arr= {4,5,6,3,4,2,4,4,9,16,};
        int k=0;
        for(int i=0; i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    k= k+1;
                }
            }
        }
        System.out.println(k);
    }
}
