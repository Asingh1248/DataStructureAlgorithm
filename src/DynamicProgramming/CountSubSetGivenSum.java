package DynamicProgramming;

public class CountSubSetGivenSum {

    public static void main(String[] args) {
        int arr [] = {2,3,5,6,8,10};
        int n = arr.length;
        int sum= 10;
        //Change in Code : Initialization --> return type chnage and keep on adding the Ubset Sum

        int ansCount= subSetCount(arr,n,sum);
        System.out.println("Number of Subset having equlas sum : "+ansCount);


    }

    private static int subSetCount(int[] arr, int n, int sum) {
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
