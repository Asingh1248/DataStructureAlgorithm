package DynamicProgramming;

public class MemoizedZeroOneKnapSack {

    public static int t[][] = new int[5][8];  //Memoziation matrix:n+1,w+1 //Given problem stmt

    public static void main(String[] args) {

        int w = 7; //Max Weight capacity ogf bag

        int wt[] = {1, 3, 4, 5};  //Choice of eslecting the item
        int val[] = {1, 4, 5, 7};
        int n = wt.length; //Size of array : - No of item

        // matrix initialization
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= w; j++)
                t[i][j] = -1; // initialize matrix with -1


        int maxprofit = knapSack(wt, val, w, n);
        System.out.println("Optimal Solution Max Profit :" + maxprofit);

    }

    private static int knapSack(int[] wt, int[] val, int w, int n) {
        //Base Condition
        if (n == 0 || w == 0) {
            return 0;
        }

        if(t[n][w] != -1) // Already Evalualed
            return t[n][w]; // If not -1 store the result else do the recursion


        else {   //else ladder for removal of return stmt.
            if (wt[n - 1] <= w)
                t[n][w] = Math.max((val[n - 1] + knapSack(wt, val, w - wt[n - 1], n - 1)),
                        knapSack(wt, val, w, n - 1)
                );
            else if (wt[n - 1] > w)
                t[n][w] = knapSack(wt, val, w, n - 1); //Remember choice diagram

            return t[n][w];

        }

    }

}
