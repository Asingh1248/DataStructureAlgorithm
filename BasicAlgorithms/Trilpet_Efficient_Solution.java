import java.util.*;

 
public class Solution {
    
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
     ArrayList<ArrayList<Integer>>  ans = new ArrayList<ArrayList<Integer>>();
     int l,r,sum=0;   
     Arrays.sort(arr);  
     //System.out.println("Step Sum is "+Arrays.sort(arr));      
     for(int i=0;i<n;i++){
         l=i;
         r=n-1;
         int k=K-arr[i];
         while(l<r){
            sum=arr[l]+arr[r];
            if(sum>k){
               r--;                  
            }
            else if (sum<k){
                l++;
            }
            int x=arr[l];
            int y=arr[r]; 
            ArrayList<Integer> stepSum=new ArrayList<Integer>(); 
            stepSum.add(arr[i]);
            stepSum.add(arr[l]); 
            stepSum.add(arr[r]); 
            System.out.println("Step Sum is "+stepSum);   
            ans.add(stepSum);  
            while(l<r && arr[l]==x){
                l++;
            }
             
            while(l<r && arr[r]==y){
                r--;
            }  
         }
        
     }    
      return ans;
	}
}
