package ArraysAndAlgorithm2;

/*
*  Given array = {1, 2, 3]
 Required array = [2 * 3, 1 * 3, 1 * 2] = [6, 3, 2]
* */

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int arr [] = new int[] {1,2,3};
        System.out.println("Input Array is :"+ Arrays.toString(arr));
        int ans [] = getProductArrayExceptSelf(arr);
        System.out.println("Output Array is : "+Arrays.toString(ans));

    }

    private static int[] getProductArrayExceptSelf(int[] arr) {
        //Your code goes here
        int size = arr.length;

        int left[] = new int[size];
        int right[] = new int[size];
        left[0]=1;
        right[size-1]=1;

        for(int i =1;i<size;i++){
            left[i]=left[i-1]*arr[i-1];
        }

        System.out.println("Left Array is :"+ Arrays.toString(left));
        for(int i=size-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        System.out.println("Right  Array is :"+ Arrays.toString(right));

        int ans[]=new int[size];
        for(int i=0;i<size;i++)
        {
            //  System.out.println("Left arry element at: " +i + " is :"+left[i] + "and right side:"+right[i]);
            ans[i]=left[i]*right[i];
        }

        return ans;
    }
}
