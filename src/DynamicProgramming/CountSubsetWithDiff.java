package DynamicProgramming;

public class CountSubsetWithDiff {

    public static void main(String[] args) {
        int arr[] ={1,1,2,3};
        int n = arr.length;
        int diff=1;

        int ansCount= countSubsetDiff(arr,n,diff);
        System.out.println("Subset Sum with Diff is "+ansCount);


    }

    private static int countSubsetDiff(int[] arr, int n, int diff) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        //Step 1: Formula derived : s1= sum(arr)+diff/2;
        int formula = (sum+diff)/2;
        System.out.println("Formula (i.e Sum) :"+formula);

        //Step 2: using Count Subset Given Sum;
        if(formula%2 !=0) //Imp
            return 0;
        else {
            System.out.println("Using the countSubSetGivenSum since formula (S1) is even");
            return countSubSetGivenSum(arr, n, formula);
        }
    }

    private static int countSubSetGivenSum(int[] arr, int n, int sum) {
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0) // column 0 1 0 2 0 3
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1;

            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j)  // arr element <+sum
                    t[i][j]= t[i-1][j] + t[i-1][j-arr[i-1]];
                else
                    t[i][j]=t[i-1][j];
            }
        }

        return t[n][sum];

    }

}

