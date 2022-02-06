package ArraysAndAlgorithm3;

/*
* Input  : arr[] = {100, 200, 300, 400}
         k = 2
Output : 700
* */

import java.util.Arrays;

public class MaximumSumSubrrayofSizeK {

    public static void main(String[] args) {

        int arr [] = {100, 200, 300, 400};
        int k =2;

        System.out.println("Input array is :"+ Arrays.toString(arr));
        System.out.println("input k is :"+k);
        int ans= maxSumSubarray(arr,k);
        System.out.println("Maximum Sum Subarray of Size K :"+ans);

    }

    private static int maxSumSubarray(int[] arr, int k) {
        int i =0;
        int size= arr.length;
        int j=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        while(j<size){
            //Step 1:
            sum+=arr[j];

            //Condition 1:  Current window is less than k and hence increase j to increase window

            if(j-i+1<k){
                j++;
            }

            else if(j-i+1==k){ // when window size hit to the required window size
                    max=Math.max(max,sum);  // selecting ans from the candidates
                 sum=sum-arr[i]; // start removing from the first
                i++;
                j++;
            }



        }
      return  max;
    }
}
