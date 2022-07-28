package BAPractice;

public class RevArr {
    static int[] revArr(int [] arr){

        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println("Before Reverse");
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }

        System.out.println("After Reverse");
        revArr(arr);

        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
