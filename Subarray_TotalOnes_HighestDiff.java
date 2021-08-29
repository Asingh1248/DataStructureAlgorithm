import java.util.*;

public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
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
