package Heap;


import java.util.Comparator;
import java.util.PriorityQueue;

class Pair
{
    Integer key;
    Integer value;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
}

public class PairMaxHeap {

    public static void main(String[] args) {

        int arr[] ={5,6,7,8,9};
        int n=arr.length;
        int X=7;
        System.out.println("Comparator usuage:");

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(int i=0;i<n;i++){
            maxHeap.add(new Pair(Math.abs(arr[i]-X),arr[i]));
        }

        System.out.println("Max Heap constructed using Pair inner class where key is constructed using some logic :");
        //System.out.println(maxHeap);

        while(maxHeap.size()>0){
            System.out.println(maxHeap.peek().getKey() + " " + maxHeap.peek().getValue());
            maxHeap.poll();
        }


    }

}
