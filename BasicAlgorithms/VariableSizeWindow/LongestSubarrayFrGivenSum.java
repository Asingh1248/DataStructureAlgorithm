import java.util.*;

public class Solution {
   
 public static int findLongestSubarrayforSum(int [] arr,int N,int K){
      int j=0,i=0;
      int ans=0;
      int sum=0;
      while(j<N){
          sum=sum+arr[j];
          System.out.println("Sum for j :"+sum);
          if(sum<K)
            j++;
          if(sum==K){
            ans=Math.max(ans,j-i+1);
            System.out.println("Ans is :"+ans);
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
     
        
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=sc.nextInt();
    int size=sc.nextInt();
    System.out.println("Sum "+sum + " ans size "+size);
    int arr[]= new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        System.out.print(arr[i]+ " ");
    }
    int ans=findLongestSubarrayforSum(arr,size,sum);
    System.out.println("Size of longest subarray having size is :"+ans + " for given sum "+sum);

}
}