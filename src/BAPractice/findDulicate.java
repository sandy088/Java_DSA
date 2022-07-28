package BAPractice;

public class findDulicate {

    static int duplicate(int[] arr){
        int ans=0;
        for (int i=0;i<arr.length;i++){

           ans= ans^arr[i];}

        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,3,4,1,3,4,55};
        System.out.println(duplicate(arr));

    }
}
