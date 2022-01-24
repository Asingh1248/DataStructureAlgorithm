package BinarySearchPart4;

public class PeakElement {

    public static void main(String[] args) {

        int arr [] = new int [] {5,10,20,15};
        int n= arr.length;

        int ans = findingPeakElement(arr,n);
        if(ans==-1)
            System.out.println("No Peak element in Array ");
        else
            System.out.println("Index of Peak element in Array is :"+ans);


    }

    private static int findingPeakElement(int[] arr, int size) {
         int start=0;
         int end=size-1;

         while(start<=end){
             int mid=start+(end-start)/2;
             if(mid >0 && mid<end){
                 if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                     return mid;
                 else if(arr[mid-1]>arr[mid]){
                      end=mid-1;
                 }
                 else if(arr[mid+1]>arr[mid]){
                      start=mid+1;
                 }
             }
             else if(mid==0){
                 if(arr[0]>arr[1])
                     return 0;
                 else
                     return 1;
             }
             else if(mid==size-1){
                 if(arr[size-1]>arr[size-2])
                     return size-1;
                 else
                     return size+1;
              }

         }
        return -1;
    }

}
