package DynamicProgramming;

public class SubsetProblem {


    public static void main(String[] args) {

        int arr [] = {2,3,7,8,10};
        int sum =15;
        int n = arr.length;

        boolean b = isSubsetPossible(arr,sum,n);
        if(b==true)
            System.out.println("Subset is Possible");
        else
            System.out.println("Subset is not Possible");


    }

    private static boolean isSubsetPossible(int[] arr, int sum,int n) {

       boolean t[][] = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0; j<sum+1;j++) {

                //Step 1 : Initialization
                if (i == 0) //row
                    t[i][j] = false; //Vertical
                if (j == 0)  //when sum(j) is zero and there is always a chance of empty subset so return it as true;
                    t[i][j] = true;
            }
        }

        // start from 1 since 1st row and column is already considerd
        for(int i=1;i<n+1;i++){
            for(int j=1; j<sum+1;j++) {
//                else {
//                    if (wt[i - 1] <= j) // imp No change
//                        t[i][j] = Math.max((val[i - 1] + t[i-1][j-wt[i-1]]),
//                                t[i-1][j]
//                        );

                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j]; //{3,}
                else if(arr[i-1]>j)
                    t[i][j]= t[i-1][j];

            }
        }
        return t[n][sum]; //return bottom most of the matrix
    }

}
