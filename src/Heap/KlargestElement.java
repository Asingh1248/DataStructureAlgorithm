package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KlargestElement {

    public static void main(String[] args) {

        int arr[]={7,10,4,3,20,15};
        int n= arr.length;
        int k=3;
//        Arrays.sort(arr);
//
//        System.out.println("Sorted Array: ");
//        System.out.println(Arrays.toString(arr));

        System.out.println();
        List<Integer> ans =  klargestElement(arr,n,k);  //Try in Sort
        System.out.println(k + " largest element in list is :" +ans);



    }

    private static List<Integer> klargestElement(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            minHeap.add(arr[i]); //Imp

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        //System.out.println(minHeap);

        while(minHeap.size()>0){
            ans.add(minHeap.peek());
            minHeap.poll();
        }

        return ans;
    }

}
