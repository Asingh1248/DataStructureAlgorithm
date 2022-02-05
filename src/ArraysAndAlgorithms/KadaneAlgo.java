package ArraysAndAlgorithms;

import java.util.Arrays;

public class KadaneAlgo {

    public static void main(String[] args) {

        int arr[] = {-1,2,-2,5,7,-3,1};
        int n =arr.length;
        System.out.println("Input array is :"+Arrays.toString(arr));
        long ans = maxSubarraySum(arr,n);
        System.out.println("Maximum Sub array sum is :"+ans);

    }

    private static long maxSubarraySum(int[] arr, int n) {

        long currentSum=0;
        long maxSum = -1;

        for (int i =0;i<n;i++){
            currentSum+=arr[i];
            maxSum=Math.max(maxSum,currentSum);

            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;

    }

}
