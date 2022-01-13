package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        //Main identification : Sorted arrays is always given
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        int key = 2;
        int ans = binarySearchAns(arr, n,key);
        System.out.println(key + " is found at "+ans + " address in array");
    }

    public static int binarySearchAns(int[] arr, int n, int key) {
        int start=0;
        int end=n-1;
        int mid=-1;
        while(start<=end){
             mid=(start) +(end-start/2); //To avoid int overflow error
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
        }
        return mid;

    }


}
