package DynamicProgrammingPart2;

public class CoinChange1 {

    public static void main(String[] args) {

        int coin [] = {1,2,3};
        int sum =5;

        int n = coin.length;

        //OP: total no fo ways : It's like : Count Subset Sum Problem where sum is given
        int maxNoOfWays =  maxNoOfWaysforSum(coin,n,sum);
        System.out.println("Max No Of Ways for getting Sum " +sum + " with coin arr  is :"+maxNoOfWays);


    }

    private static int maxNoOfWaysforSum(int[] arr, int n, int sum) {
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                //Initialization if arr size is 0 and
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1; //if sum is 0 then One ways is Empty Subset

            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j) {
                    t[i][j] = t[i - 1][j] + t[i][j - arr[i - 1]];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }


        return t[n][sum];
    }
}
