package Stacks3;

import Stacks2.Pair;

import java.util.*;

public class MaximumAreaHistogram {

    public static void main(String[] args) {
        /*
        Formula :NSR-NSL-1
       1. Find NSL and NSR of element
       2. Prepare the Array for above formula
       3. Formula : area[i]=arr[i]*width[i]
        *
         */

//        int arr [] = {6,2,5,4,5,1,6};
        //Pseudo Index Concept in Graph

        int arr [] = {2,4};
        int n = arr.length;

        System.out.println("Input Array is :"+ Arrays.toString(arr));

        int pseudo_indexLeft =-1;
        int pseudo_indexRight =n;

        List<Integer> NSRList = NSRIndex(arr,n,pseudo_indexRight);
        System.out.println("NSR List for input Array is :"+NSRList);
        List<Integer> NSLList = NSLIndex(arr,n,pseudo_indexLeft);
        System.out.println("NSL List for input Array is :"+NSLList);

        int ans = maxAreaHistogram(NSRList,NSLList,arr,n);
        System.out.println("Max Area of Histogram is :"+ans);


    }

    private static int maxAreaHistogram(List<Integer> nsrList, List<Integer> nslList, int[] arr, int n) {
        int width[] = new int[n];

        for(int i =0;i<n;i++){
            width[i]=nsrList.get(i)-nslList.get(i)-1;
        }
        System.out.println("Width Array is :"+Arrays.toString(width));

        int area[] = new int[n];

        for(int i =0;i<n;i++){
            area[i]=arr[i]*width[i];
        }

        System.out.println("Area Array is :"+Arrays.toString(area));
        int maxArea=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            maxArea=Math.max(maxArea,area[i]);
        }

        return maxArea;
    }

    private static List<Integer> NSLIndex(int[] arr, int n, int pseudo_indexLeft) {

        Stack<Pair> stk = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            //Part 1
            if(stk.isEmpty()){
                ans.add(pseudo_indexLeft);
                stk.push(new Pair(arr[i],i));
            }
            //Part 2:
            else if(!stk.isEmpty() && arr[i]>stk.peek().getKey()){
                ans.add(stk.peek().getValue());
                stk.push(new Pair(arr[i],i));
            }
            //Part 3
            else if(!stk.isEmpty() && arr[i]<stk.peek().getKey()){
                while(!stk.isEmpty() && arr[i]<stk.peek().getKey()){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ans.add(pseudo_indexLeft);
                    stk.push(new Pair(arr[i],i));
                }
                else if(arr[i]>stk.peek().getKey()){
                    ans.add(stk.peek().getValue());
                    stk.push(new Pair(arr[i],i));
                }
            }

        }
        return ans;
    }



    private static List<Integer> NSRIndex(int[] arr, int n, int pseudo_indexRight) {
   Stack<Pair> stk = new Stack<>();
    List<Integer> ans = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
        //Part 1
        if(stk.isEmpty()){
            ans.add(pseudo_indexRight);
            stk.push(new Pair(arr[i],i));
        }
        //Part 2:
        else if(!stk.isEmpty() && arr[i]>stk.peek().getKey()){
            ans.add(stk.peek().getValue());
            stk.push(new Pair(arr[i],i));
        }
        //Part 3
        else if(!stk.isEmpty() && arr[i]<stk.peek().getKey()) {
            while (!stk.isEmpty() && arr[i] < stk.peek().getKey()) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                ans.add(pseudo_indexRight);
                stk.push(new Pair(arr[i], i));
            } else if (arr[i] > stk.peek().getKey()) {
                ans.add(stk.peek().getValue());
                stk.push(new Pair(arr[i], i));
            }
        }
     }
        Collections.reverse(ans);
        return ans;
  }
}
