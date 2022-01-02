package DynamicProgramming;

public class TopDownApproachZeroOneKnapSack {


    public static void main(String[] args) {

        int w = 7;

        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int n = wt.length;

        int maxprofit = knapSack(wt, val, w, n);
        System.out.println("Optimal Solution Max Profit using Bottom Up Approach:" + maxprofit);



    }

    private static int knapSack(int[] wt, int[] val, int w, int n) {
        int t[][] = new int[n+1][w+1];

        for(int i =0;i<n+1;i++) {
            for (int j = 0; j < w + 1; j++) {

                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }

//                if (wt[n - 1] <= w)
//                    t[n][w] = Math.max((val[n - 1] + knapSack(wt, val, w - wt[n - 1], n - 1)),
//                            knapSack(wt, val, w, n - 1)
//                    );
                //replace n = i and w==j
                else {
                    if (wt[i - 1] <= j) // imp No change
                        t[i][j] = Math.max((val[i - 1] + t[i-1][j-wt[i-1]]),
                                t[i-1][j]
                        );


                    else if (wt[i - 1] > j) {
                        t[i][j] = t[i - 1][j];
                    }

                }
            }
        } //for loop closed
        return t[n][w];
    }
}
