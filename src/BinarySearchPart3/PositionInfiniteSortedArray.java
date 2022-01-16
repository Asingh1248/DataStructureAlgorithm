package BinarySearchPart3;

import BinarySearchPart2.ElementInRotatedSortedArray;

public class PositionInfiniteSortedArray {


    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,18,20,25,26,100,1000};

        int key =7;
        int n = arr.length;
        int ans = findPos(arr,key,n);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);

    }

    private static int findPos(int[] arr,int key, int size) {

        int start=0;
        int end=1;
        while(key>arr[end]){
            start=end;
            end=end*2;
        }
        return ElementInRotatedSortedArray.binarySearch(start,end,arr,key);

    }


}
