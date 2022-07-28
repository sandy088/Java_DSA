package BAPractice;

public class firstOccandLastOcc {
    public static int fisrtOcc(int arr[],int key){
        int n= arr.length;
        int s=0,e=n-1;
        int mid= s+(e-s)/2;
        int ans=-1;

        while(s<=e){

            if (arr[mid]==key){
                ans=mid;
                e= mid-1;
            } else if (arr[mid]>key) {
                e=mid-1;
            }else {
                s= mid+1;
            }
            mid= s+(e-s)/2;
        }
        return ans;
    }

    public static int LastOcc(int arr[],int key){
        int n= arr.length;
        int s=0,e=n-1;
        int mid= s+(e-s)/2;
        int ans=-1;

        while(s<=e){

            if (arr[mid]==key){
                ans=mid;
                s=mid+1;
            } else if (arr[mid]>key) {
                e=mid-1;
            }else {
                s= mid+1;
            }
            mid= s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={0,1,2,3,3,3,5,5};
        int key=3;
        System.out.println(fisrtOcc(arr,key));
        System.out.println(LastOcc(arr,key));
    }
}
