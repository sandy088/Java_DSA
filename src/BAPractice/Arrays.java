package BAPractice;

import java.util.Scanner;

import static java.lang.Math.max;

public class Arrays {

    static int getMin(int[] arr){

        int min= Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            if (arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
    static int getMax(int[] arr){

        int maxi= Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            maxi= max(maxi,arr[i]);
//            if (arr[i]>max){
//                max= arr[i];
//            }
        }
        return maxi;
    }
    public static void main(String[] args) {

//        int [] arr= {-5,1,2,5,4,8,91,125,3,4};
        int [] arr= new int[10];

        Scanner sc= new Scanner(System.in);

        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Maximum value in Array is: "+getMax(arr));
        System.out.println("Minimum value in Array is: "+getMin(arr));
    }
}
