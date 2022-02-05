package ArraysAndAlgorithms;

/*
*    Suppose the given array is ‘ARR’ = { 5, 0, 2, 3, 1} and ‘K = 5’.
As we can see in below image, there are a total of 6 subarrays that have the total sum divisible by ‘K’
So we return the integer 6.
* */

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayDivisibleByK {

    public static void main(String[] args) {
        int arr [] = { 5, 0, 2, 3, 1};
        int k = 5;
        int n= arr.length;
        ArrayList <Integer> inputArray = new ArrayList<>();
        inputArray.add(5);
        inputArray.add(0);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(1);
        Arrays.asList(arr);
        System.out.println("Input ArrayList :"+inputArray);
        int ans = subArrayCount(inputArray,k);
        System.out.println("No of Subarray whose sum is divisible by " +k+  " is :"+ans);

    }
    public static int subArrayCount(ArrayList < Integer > arr, int k) {

        // To store count of the all subarray has sum is divisible by 'k'.
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {

            // To store sum of subarray, starting indices are 'i'.
            int curSum = 0;

            // Check all subarray that can have sum divisible by 'k'.
            for (int j = i; j < arr.size(); j++) {
                curSum = curSum + arr.get(j);
                if (curSum % k == 0) {
                    count += 1;
                }
            }
        }

        return count;
    }








}
