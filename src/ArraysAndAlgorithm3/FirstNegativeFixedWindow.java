package ArraysAndAlgorithm3;

import java.util.*;

public class FirstNegativeFixedWindow {

    public static void main(String[] args) {
        long inputArr []= new long[]{-8, 2, 3, -6, 10};
        int N=inputArr.length;
        int K=4;
        List<Long> ans = printFirstNegativeIntegerFixedWindow(inputArr,N,K);
        System.out.println("Input Array is :"+ Arrays.toString(inputArr));
        System.out.println("First Negative array is "+ans);


    }

    private static List<Long> printFirstNegativeIntegerFixedWindow(long[] arr, int n, int k) {
        int i =0;
        int j=0;
        Queue<Long> Di= new LinkedList<Long>(); // To Stor
        List<Long> ans = new ArrayList<Long>();
        while(j<n){
            if(arr[j]<0)
                Di.add(arr[j]);
            if(j-i+1<k)
                j++;
            else if (j-i+1==k){
                if(!Di.isEmpty())
                    ans.add(Di.peek());  //First Negative No
                else
                    ans.add(0L);
                if(arr[i]<0)
                    Di.remove();
                i++;
                j++;
            }
        }

      return  ans;

    }
}
