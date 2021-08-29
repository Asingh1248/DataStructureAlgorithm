import java.util.*;
public class Solution {

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        
       while(k!=1){
           for(int i =0;i<n;i++){
             arr.add(arr.get(i));
           }
           k--;
       } 
      // System.out.println("Array list : "+arr); 
       
       int newSize=arr.size();
        long currSum=0,max=-1;
       for(int i=0;i<newSize;i++){
           currSum=Math.max(0L,currSum+arr.get(i));
          // System.out.println("CurrSum is :"+currSum);
           max=Math.max(max,currSum);
          // System.out.println("Max :"+max);
           if(currSum<0){
               currSum=0;
           }
           
       } 
       return max;
        
	}
}