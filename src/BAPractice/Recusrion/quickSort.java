package BAPractice.Recusrion;

public class quickSort {
    public static int partition(int [] arr, int s, int e){

        int pivot= arr[s];
        int cont= 0;
        for(int i=s+1; i<=e;i++){
            if(arr[i]<=pivot){
                cont++;
            }
        }

        int pivotIndex= s+cont;

        //swapping
        int temp= arr[s];
        arr[s]=arr[pivotIndex];
        arr[pivotIndex]= temp;
        //Handling the left & right part -- small elements from pivot will come in left side and greator elemnts come on right side of pivot
        int i=0;
        int j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }

            if (i<pivotIndex && j>pivotIndex){
                int temp1= arr[i];
                arr[i]=arr[j];
                arr[j]= temp1;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSorti(int [] arr, int s, int e){

        //Base case
        if(s>=e){
            return;
        }

        int p= partition(arr, s, e);

        //left part
        quickSorti(arr,s,p-1);

        //Right part
        quickSorti(arr,p+1,e);
    }
    public static void main(String[] args) {

        int [] arr= {55,6,4,102,45,10};
        quickSorti(arr,0,arr.length-1);

        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
