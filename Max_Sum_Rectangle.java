public class Solution
{    

    public static int Kadane(int arr[]){ 
        int currSum=0;
        int Max=0;
       
        for(int j=0;j<arr.length;j++){
            currSum+=Math.max(0,currSum+arr[j]);
            Max=Math.max(Max,currSum);
            
            if(currSum<0){
                currSum=0;
            }
        }
        return Max;
    }
    
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
      // Initliaze the Ans; 
      int ans=0;
      
      //Fixing c1 column
      for(int c1=0;c1<m;c1++){
          //Initialize the rowSum after every new pointer change
          int rowSum[]=new int[n];
          
          //Iterating the c2 to get the range
          for(int c2=c1;c2<m;c2++){
              
              //Calculating the rowSum
              for(int i=0;i<n;i++){
                  rowSum[i]+=arr[i][c2];
                  //System.out.println("RowSum array :"+rowSum[i]);
                  //System.out.println("Kadane rowSum :"+Kadane(rowSum));
                  ans=Math.max(ans,Kadane(rowSum));
              }
          }
      } //Three for loop ending
       return ans;   
    }
}
