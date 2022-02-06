package ArraysAndAlgorithm4;

import java.util.Arrays;
import java.util.Scanner;

/*
*
*
* */


public class LongestSubarrayFrGivenSum {

    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int K=sc.nextInt();
//        int size=sc.nextInt();
//        System.out.println("Sum "+K + " ans size "+size);
//        int arr[]= new int[size];
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextInt();
//            System.out.print(arr[i]+ " ");
//        }

       int K = 5;  //Given Sum;
       System.out.println("Given Sum is :"+K);
       int arr[] = new int [] {4,1,1,1,1,2,3,5};
       System.out.println("Input Array is :"+ Arrays.toString(arr));
       int size= arr.length;
       int ans=findLongestSubarrayforSum(arr,size,K);
       System.out.println("Size of longest subarray having size is :"+ans + " for given sum "+K);

    }

    private static int findLongestSubarrayforSum(int [] arr,int N,int K) {
        int j=0,i=0;
        int ans=0;
        int sum=0;
        while(j<N){
            sum=sum+arr[j];
            System.out.println("Sum  at start of loop :"+sum);
            if(sum<K)
                j++;
            if(sum==K){
                ans=Math.max(ans,j-i+1);
                System.out.println("Ans when k is equal to subarray sum  :"+ans);
                j++;
            }
            if(sum>K){
                while(sum>K){
                    sum=sum-arr[i];
                    System.out.println("Sum when gretear then K :"+sum);
                    if(sum==K){
                        ans=Math.max(ans,j-i+1);
                        System.out.println("Ans is :"+ans);
                    }
                    i++; //Reducing the size of window
                }
                j++;
            }

        }
        return ans;
    }

}


