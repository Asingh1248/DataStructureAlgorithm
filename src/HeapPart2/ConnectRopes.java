package HeapPart2;

import java.util.PriorityQueue;

public class ConnectRopes {


    public static void main(String[] args) {
         int arr [] = {1,2,3,4,5}; //length of Ropes
         int n= arr.length;

         int ans= minimumCost(arr,n);
        System.out.println("Minimum cost to connect all ropes for length given in input array : "+ans);
    }

    private static int minimumCost(int[] arr, int n) {
        int totalcost=0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<n;i++){
           minHeap.add(arr[i]);
        }
        System.out.println("Min Heap is : "+minHeap);

        //Logic : - At any given time we connect two ropes which is smallest in length
        //Atleast we need two ropes to connect

        while(minHeap.size()>=2){
            System.out.println(minHeap);
           int first=minHeap.peek();
           minHeap.poll();

           int second=minHeap.peek();
           minHeap.poll();

           totalcost = totalcost +first +second;
           //3 ,,[]
           System.out.println("Total cost for ropes to connect is :"+totalcost);


           minHeap.add(first +second); //Adding first and second in heap again //Use Paper to agin derive t
        }

        return totalcost;
    }


}
