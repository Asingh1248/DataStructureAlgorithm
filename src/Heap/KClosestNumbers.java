package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestNumbers {

    public static void main(String[] args) {

        int arr[] = {5,6,7,8,9};
        int X=7;
        int k=3;

        int n= arr.length;
        List<Integer> ans= kClosestNumber(arr,X,k,n);
        System.out.println(k + " Number Closest to " +X + " in given array is : "+ans);

    }

    private static List<Integer> kClosestNumber(int[] arr, int x, int k, int n) {

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return  o2.getKey().compareTo(o1.getKey()); //V Imp we are comparing on basis on key  and Compartor is
                // require in Object how doe we compare based on key or Value //Why priority Queue how to priority se i
            }
        });
        int key=0;
        for(int i=0;i<n;i++){
            key=Math.abs(arr[i]-x);
            maxHeap.add(new Pair(key,arr[i])); //Imp
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }


        List<Integer> ans = new ArrayList<>();
        while(maxHeap.size()>0){

            System.out.println(maxHeap.peek().getKey() + " " + maxHeap.peek().getValue());
            ans.add(maxHeap.peek().getValue());
            maxHeap.poll();
        }
        return  ans;
    }

}
