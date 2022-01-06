package HeapPart2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair1{
     Integer x;
     Integer y;

    public Pair1(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}

class Pair2{

    Integer key;
    Pair1 pair1;

    public Pair2(int key, Pair1 pair1) {
        this.key = key;
        this.pair1 = pair1;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Pair1 getPair1() {
        return pair1;
    }

    public void setPair1(Pair1 pair1) {
        this.pair1 = pair1;
    }
}

public class KClosestPointsToOrigin {

    public static void main(String[] args) {

        int arr [][] =new int[][]{{1,3},{-2,2},{5,8},{0,1}};
        System.out.println("Input Array of X and Y cooridnate");

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 2; j++) {
                System.out.print(+arr[i][j] + " ");
            }
            System.out.println();
        }

        int k =2;

      closestPointsToOrigin(arr,k);



    }

    private static void closestPointsToOrigin(int[][] arr, int k) {
        int ans [][]  = new int[k][2];

        //Jyada value wale nikalna hai (Pop) so that min value niche rahe

        PriorityQueue<Pair2> maxHeap = new PriorityQueue<>(new Comparator<Pair2>() {
            @Override
            public int compare(Pair2 o1, Pair2 o2) {
                return o2.getKey().compareTo(o1.getKey());  //Always while derefrenicing the get should Inetger
            }
        });

        int key;
        for(int i=0 ;i< arr.length;i++)
        {
                key=arr[i][0] * arr[i][0] +arr[i][1] *arr[i][1] ; //x^2+y^2
                maxHeap.add(new Pair2(key,new Pair1(arr[i][0],arr[i][1])));

                if(maxHeap.size()>k){
                    maxHeap.poll();
                }

        }

        while(maxHeap.size()>0){

            System.out.println("Max Heap Key git  :"+maxHeap.peek().getKey() + " Value is { "
                    + maxHeap.peek().getPair1().getX() + " , " +maxHeap.peek().getPair1().getY() + "}");

            maxHeap.poll();
        }


    }


}
