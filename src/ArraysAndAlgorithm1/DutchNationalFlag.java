package ArraysAndAlgorithm1;

/*
Problem Statement

        Given an array consisting of only 0s, 1s and 2s, sort the array.
 Steps:
The Dutch National Flag algorithm or three-way partitioning algorithm allows
sorting the array consisting of 0s, 1s, and 2s in a single traversal only and in constant space.

Maintain three indices low = 0, mid = 0, and high = N-1, where N is the number of elements in the array.
The range from 0 to low denotes the range containing 0s.
The range from low to mid denotes the range containing 1s.
The range from mid to high denotes the range containing any of 0s, 1s, or 2s.
The range from high to N-1 denotes the range containing 2s.


*/

import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,2,2,1,0,2} ;
        System.out.println("Input array is : "+ Arrays.toString(arr));
        DNF(arr);


    }

    private static void DNF(int[] arr) {

        //Write your code here
        int low=0;
        int mid=0;
        int high=arr.length-1;


        while(mid<=high){
            if(arr[mid]==0){

                int c;
                c=arr[mid];
                arr[mid]=arr[low];
                arr[low]=c;

                low++;
                mid++;

            }
            else if(arr[mid]==1){
                mid++;
            }

            else if(arr[mid]==2){
                //System.out.println("Before 2 Encounter is "+arr[mid]);
                //swap(arr[high],arr[mid]);
                int c;
                c=arr[mid];
                arr[mid]=arr[high];
                arr[high]=c;
                high--;
            }
        }
        System.out.println("Sorted Array is :"+Arrays.toString(arr));
    }


}
