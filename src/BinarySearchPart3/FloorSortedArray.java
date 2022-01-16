package BinarySearchPart3;

import java.util.Arrays;

public class FloorSortedArray {

    public static void main(String[] args) {
        int key = 5;
        int arr[] = {1,2,3,4,8,10,10,12,19};
        int n=arr.length;
        int floor = findingFloor(arr,key,n);

        //Greatest element smaller than key in 5 present in array
        System.out.println("Floor of the element :"+key + " present in array "+ Arrays.toString(arr) + " is "+floor);




    }

    private static int findingFloor(int[] arr, int key, int n) {
        int result=-1;
        int start=0;
        int end= n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                result=arr[mid];  //Imp
                start=mid+1;
            }
        }
        return result;
    }

}
