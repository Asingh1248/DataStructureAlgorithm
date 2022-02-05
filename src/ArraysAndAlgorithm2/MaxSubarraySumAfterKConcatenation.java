package ArraysAndAlgorithm2;

/*
* Fo
*
The subarray with a maximum sum of 12 is [1, 3, 1, 3, 1, 3].
* Sum= (1+3)*3=4*3 = 12
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubarraySumAfterKConcatenation {

    public static void main(String[] args) {
        int inputarr [] ={1,3};
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        int n = arr.size();
        int k =3;
        System.out.println("Input array is :"+arr);
        long maxSum= maxSubSumKConcat( arr,n,k);
        System.out.println("Maximum subarray sum after " +k+ " concatenation is :"+maxSum);

    }

    private static long maxSubSumKConcat(List<Integer> arr, int n, int k) {
        long currSum=0,max=-1;
        while(k!=0){
            for(int i =0;i<n;i++){
                //System.out.println("CurrSum element :"+arr.get(i) );
                currSum=Math.max(0L,currSum+arr.get(i));
                // System.out.println("CurrSum is :"+currSum);
                max=Math.max(max,currSum);
                // System.out.println("Max :"+max);
                if(currSum<0){
                    currSum=0;
                }
                //arr.add(arr.get(i));
            }
            k--;
        }
        // System.out.println("Array list : "+arr);
        return max;
    }
}
