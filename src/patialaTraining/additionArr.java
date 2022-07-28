package patialaTraining;

import java.util.Scanner;

public class additionArr {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int[] arr= {size};
        int[] arr2={size};

        int[]arr3= new int[size];

        System.out.println("Enter 1st Array");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter 2nd Array");
        for (int i=0;i<arr.length;i++){
            arr2[i]= sc.nextInt();
        }
        System.out.println("Your resultant 3rd array");
        for (int i=0;i<arr.length;i++){
            arr3[i]=arr[i]+arr2[i];
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
