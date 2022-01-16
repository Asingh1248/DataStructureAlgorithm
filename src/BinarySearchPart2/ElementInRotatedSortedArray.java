package BinarySearchPart2;

import BinarySearch.BinarySearch;

public class ElementInRotatedSortedArray {

    public static void main(String[] args) {

        int arr[] = {11,12,15,18,2,5,6,8};
        int n= arr.length;

        int k=50;

        int index = noOfTimeRotatedSortedArray(arr,n);
        System.out.println("Minimum element in Rotated Sorted Array :"+index);


        int keyFoundIndexLeft =binarySearch(0,index-1,arr,k);
        int keyFoundIndexRight= binarySearch(index,n-1,arr,k);

        if(keyFoundIndexLeft >-1)
            System.out.println("Key Found at location is :"+keyFoundIndexLeft);
        if(keyFoundIndexRight >-1)
            System.out.println("Key Found at location is :"+keyFoundIndexRight);
        else
            System.out.println("Key could not be found");
    }

    private static int noOfTimeRotatedSortedArray(int[] arr, int N) {
        int start=0;
        int end=N-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            int next = (mid+1)%N;
            int previous=(mid+N-1)%N;

            if(arr[mid]<=arr[previous] && arr[mid]<=arr[next]){
                return  mid;
            }
            //arr[mid]... arr[end] ] //Go to left side
            else if(arr[mid]<=arr[end]){
                end=mid-1;
            }
            //arr[start] ..arr[mid] // Go to right side
            else if(arr[mid]>=arr[start]){
                start=mid+1;
            }


        }
        return -1;

    }


    public static int binarySearch(int start, int end, int[] arr,int k) {

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
                end=mid-1;
//            11,12,15,18
            else if(arr[mid]<k)
                start=mid+1;

        }
      return  -1;
    }

}
