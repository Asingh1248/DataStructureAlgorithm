package ArraysAndAlgorithm2;

/*
Given a 2D array, find the maximum sum subarray in it. For example, in the following 2D array,
        the maximum sum subarray is highlighted with blue rectangle and sum of this subarray is 29.
*/


public class MaximumSumRectangle {
    // Driver Code
    public static void main(String[] args)
    {
        int arr[][] = new int[][] { { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 10, 1, 3 },
                { -4, -1, 1, 7, -6 } };

        // Function call
        int m = arr.length;
        System.out.println("No of Rows :"+m);
        int n = arr[0].length;
        System.out.println("No of Columns :"+n);
        System.out.println(maxSumRectangle(arr,m,n));
    }

    private static int maxSumRectangle(int[][] arr, int row , int col) {
        int ans=0;

        //Fixing c1 column
        for(int c1=0;c1<col;c1++){
            //Initialize the rowSum after every new pointer change
            int rowSum[]=new int[row];

            //Iterating the c2 to get the range
            for(int c2=c1;c2<col;c2++){

                //Calculating the rowSum
                for(int i=0;i<row;i++){
                    rowSum[i]+=arr[i][c2];
                    //System.out.println("RowSum array :"+rowSum[i]);
                    //System.out.println("Kadane rowSum :"+Kadane(rowSum));
                    ans=Math.max(ans,Kadane(rowSum));
                }
            }
        } //Three for loop ending
        return ans;

    }

    private static int Kadane(int[] arr) {
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

}
