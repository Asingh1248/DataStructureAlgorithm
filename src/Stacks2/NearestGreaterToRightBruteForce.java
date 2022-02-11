package Stacks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearestGreaterToRightBruteForce {

    public static void main(String[] args) {
        int arr [] ={11, 13, 21, 3};
        System.out.println("Input Array is :"+ Arrays.toString(arr));
        int N =arr.length;
        NLEUsingForLoop(arr,N);
    }

    private static void NLEUsingForLoop(int[] arr, int n) {
       List<Integer> ans= new ArrayList<>();


        for(int i =0;i<n;i++){
            int greatestElement=-1;
            for(int j =i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    greatestElement=arr[j];
                    break;
                }
            }
            ans.add(greatestElement);
        }
        System.out.println("Output Array is :"+ans);

    }

}
