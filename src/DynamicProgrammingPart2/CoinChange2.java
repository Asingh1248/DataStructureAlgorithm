package DynamicProgrammingPart2;

public class CoinChange2 {

    public static void main(String[] args) {
        int coin [] = {1,2,3};
        int sum = 5;
        int n = coin.length;

        //Op Minimum No of Coins to make the sum 5
         int minCoin = minCoinForSum(coin,n,sum);
        System.out.println("Minimum No of coin to make the sum :"+sum + " is "+minCoin);

    }
    //Initialization there : Normal Initialization

    private static int minCoinForSum(int[] arr, int n, int sum) {
        int t[][] = new int[n+1][sum+1];

        for(int i = 0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){

                //If arr[size] is 0 then logical is not possible to have min no cin but mathematically we can have Infinite ways to make sum
                if(i==0)
                  t[i][j]=Integer.MAX_VALUE-1;
                if(j==0)  //Sum is 0 then we have 0 no of coin to make sum 0
                    t[i][j]=0;
            }
        }

//       Trick    : 2nd row : int []={3,5,4} and sum=4 t[1][4] //3 ko kitna bhi add kardo 4 nahi aaygea
//      and sum=3  3 ko add karne pe aayega  1/3 ,2/3 ,3/3 ,4/3

        for(int j=1;j<sum+1;j++) {
                if (j % arr[0] == 0)
                    t[1][j] = j / arr[0];
                else
                    t[1][j] = Integer.MAX_VALUE - 1;
        }


         for(int i=2;i<n+1;i++){
             for(int j=1;j<sum+1;j++){  //j=1 Imp  ->Draw rough matrix
                 if(arr[i-1]<=j)
                     t[i][j]=Math.min(t[i-1][j]+0,1+t[i][j-arr[i-1]]);
                             // exclude and include (coin added therefore 1 is added   and hence MAX_VALUE-1;
                 else
                     t[i][j]=t[i-1][j];
             }
         }
        System.out.println("Printing the DP matrix :Understand  it(Subset Problem) ");
         for(int i=0;i<n+1;i++){
             for(int j =0;j<sum+1;j++){
                 System.out.print(t[i][j] + " ");
             }
             System.out.println();
         }

        return t[n][sum];
    }
}
