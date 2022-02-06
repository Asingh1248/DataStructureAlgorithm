package ArraysAndAlgorithm3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Input : arr[] = {-8, 2, 3, -6, 10}, k = 2
Output : -8 0 -6 -6
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6
*
* */


public class FirstNegativeNumberBruteForce {

    public static void main(String[] args) {
        long inputArr []= new long[]{-8, 2, 3, -6, 10};
        int N=inputArr.length;
        int K=2;
        List<Long> ans = printFirstNegativeInteger(inputArr,N,K);
        System.out.println("Input Array is :"+ Arrays.toString(inputArr));
        System.out.println("First Negative array is "+ans);
        
        
    }

    private static List<Long> printFirstNegativeInteger(long[] arr, int n, int k) {
        int size = arr.length;
        List<Long> ans = new ArrayList<>(n-k+1);
        for(int i=0;i<=n-k;i++){
            long firstNegativeNo =0L;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    firstNegativeNo=arr[j];
                    break;
                }
            }
            ans.add(firstNegativeNo);
        }
        return  ans;
    }
}
