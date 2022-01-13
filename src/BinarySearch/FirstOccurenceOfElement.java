package BinarySearch;

public class FirstOccurenceOfElement {
    // Binary Search + ()
    public static void main(String[] args) {
        int arr[] = {2,4,10,10,10,18,20};
        int n= arr.length;
        int key = 5;
        int ans = firstOccurence(arr,n,key);
        System.out.println(key  + " first occurrence in array is at: " +ans + " index") ;

    }

    private static int firstOccurence(int[] arr, int n, int key) {
        int result=-1;
        int start=0;
        int end=n-1;

        while(start<=end){
           int mid=start+(end-start/2);

           if(arr[mid]==key){
               result=mid;
               end=mid-1;
           }
           else if(arr[mid]>key){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
        }

        return  result;
    }

}
