package DynamicProgrammingPart4;

public class MCM {

    public static void main(String[] args) {

        int arr[] = new int [] {10,30,5,60};
       int n=arr.length;

       //Step 1: Finding i &j

       int i=1;
       int j=n-1;

       int costOfMultiplication =solve(arr,i,j);
       System.out.println("Cost Of Multiplication :"+costOfMultiplication);

    }

    private static int solve(int[] arr, int i, int j) {

        //Step 2: Base Condition
        if(i>=j){
            return 0;
        }

        //Step 3: Find k loop scheme
        int mn=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){

            int tempans= solve(arr,i,k)
                        + solve(arr,k+1,j)
                        +arr[i-1]*arr[k]*arr[j];

            mn=Math.min(mn,tempans);

        }
        return mn;
    }
}
