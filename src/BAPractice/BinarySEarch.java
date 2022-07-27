package BAPractice;

public class BinarySEarch {
    public static int BinarySearch(int[] arr,int n, int key){
        int start=0;
        int end = n-1;

        int mid= start+ ((end- start)/2);

        while(start<=end){
            if (arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end= mid-1;
            }
            else{
                start= mid+1;
            }

            mid= start+ ((end- start)/2);
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};

        System.out.println(BinarySearch(arr,arr.length,6));
    }
}
