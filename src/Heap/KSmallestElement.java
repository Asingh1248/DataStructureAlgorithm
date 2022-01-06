package Heap;


import java.util.Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestElement {

    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int n= arr.length;
        int k=3;
//        Arrays.sort(arr);
//
//        System.out.println("Sorted Array: ");
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println();
        int ans =kSmallestElement(arr,n,k);  //Try in Sort
        System.out.println(k + "rd Smallest is : " +ans);
    }

    public static int kSmallestElement(int[] arr, int n, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {

            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll(); //Removing Top of MaxHeap
            }

        }
        return maxHeap.peek();
    }

}
