package ArraysAndAlgorithm2;

/*
* If you are given an array {1, 1, 0, 0, 1} then you will have to return
* the count of maximum one’s you can obtain by flipping anyone
* chosen sub-array at most once, so here you will clearly
* choose sub-array from the index 2 to 3 and then flip it's bits. 3
* So, the final array comes out to be {1, 1, 1, 1, 1}
* which contains five ones and so you will return 5.
*
* */


import java.util.Arrays;

public class FlipBits {

    public static void main(String[] args) {
         int arr [] = {1,0,0,1,0};
         int n= arr.length;
        System.out.println("Input Array is :"+ Arrays.toString(arr));
         int ans = flipBits(arr,n);
        System.out.println("Maximum no of ones after flipping the bits from subarray atmost once :"+ans);

    }

    private static int flipBits(int[] arr, int n) {
        int totalones=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                totalones++;
            }
            int count1=0,count0=0;
            for(int j=i;j<n;j++){

                if(arr[j]==0){
                    count0++;
                }
                else if(arr[j]==1){
                    count1++;
                }
                max=Math.max(max,(count0-count1));
            }//inner

        }//outer
        int ans=0;
        ans=totalones+max;
        return ans;
    }
}


/*
* For the first test case:
We can perform a flip operation in the range [1,2]. After the flip operation, the array is: 1 1 1 1 0
and so the answer will be 4
*
* */
