package BinarySearchPart2;

import java.util.Arrays;

public class NoOfTimeRotatedSortedArray {

    public static void main(String[] args) {

        int arr[] = {11,12,15,18,2,5,6,8};
        int n= arr.length;

        int ans = noOFTimeRotatedSortedArray(arr,n);
        System.out.println("No of times sorted array :"+ Arrays.toString(arr) + " is rotated is :" +ans);

    }

    private static int noOFTimeRotatedSortedArray(int[] arr, int n) {
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            System.out.println("Mid calculated is at index :"+mid);
            //Finding next and previous of minum element
            //if(arr[mid]==k) --> arr[mid] is the answer

            //We don't know k woh mid jiska previous and next bhi condition

            int next=(mid+1)%n;
            int previous=(mid+n-1)%n; //0-1

            if(arr[mid] <=arr[previous] && arr[mid]<=arr[next] ){
                return  mid;
            }

            // if nums[mid…high] is sorted, and `mid` is not the minimum element,
            // then the pivot element cannot be present in nums[mid…high],
            // discard nums[mid…high] and search in the left half
            else if(arr[mid]<=arr[end]){
                System.out.println("Insorted Part on left side :");
                end=mid-1; // Go to unsorted Part -- Left side
            }
            //Discrading the
            else if(arr[mid]>=arr[start]) {
               start=mid+1; // Go to Unsorted Part -- Right Side

               //[ 2, 5, 6, 8]
                System.out.println("Insorted Part on Right side ");
            }

        }
       return  -1;
    }

}
