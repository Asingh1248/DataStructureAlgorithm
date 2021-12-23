package DynamicProgramming;

public class EqualSumPartition {


    public static void main(String[] args) {

        int arr[] = {1, 5, 11, 6};
        int n = arr.length;
        //Take the sum

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        boolean b;
        if(sum%2!=0)
             b=false;
        else
          b=isEqualSumPartition(arr, n, sum/2);

        if (b == true)
            System.out.println("There are two subset in array having Equal Sum ");
         else
            System.out.println("There are NO two subset in array having Equal Sum");


    }

    private static boolean isEqualSumPartition(int[] arr, int n, int sum) {
        boolean t[][] = new boolean[n+1][sum+1];

         //Intialization
        for(int i=0;i<n+1;i++){
            for(int j=0; j<sum+1;j++) {

                //Step 1 : Initialization
                if (i == 0) //row
                    t[i][j] = false; //Vertical
                if (j == 0)  //when sum(j) is zero and there is always a chance of empty subset so return it as true;
                    t[i][j] = true;
            }
        }


        for(int i=1;i<n+1;i++){
            for(int j =1;j<sum+1;j++){
                if(arr[i-1]<=j)  //<=j :SUm (Column)  //i is arrize
                    t[i][j] =   t[i-1][j-arr[i-1]]  || t[i-1][j] ;//exclude and include
                else
                    t[i][j] = t[i-1][j]; //Think of Matrix

            }
        }

        return t[n][sum]; //Last block
    }

}
