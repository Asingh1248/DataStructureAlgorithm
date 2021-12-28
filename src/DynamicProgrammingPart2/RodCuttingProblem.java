package DynamicProgrammingPart2;

public class RodCuttingProblem {

    public static void main(String[] args) {
        //Similar to Unbounded Knapsack but you need to think like of Knapsack

        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int l = 8;
        int p = price.length;

        /*
        Identification : We need to maximize the profit Note length of rod can occur multiple times
        Step 1: Construct a length [] from given N = 8
        */


        int length[] = new int[l];

        for (int i = 0; i < l; i++) {
            length[i] = i + 1;
        }

        /* Similarity :
         *  wt[] = length [] :-n//imp
         *  val[] =price [] :-p  //Imp
         *  w= N :-Max Capacity  //Length of Rod
         *  n= Length of Price Array //imp
         * t[n][w] = t[p][n]*/

        //Step 2:
        int maxProfit = maxProfitRodCuttingProblem(price, p, length, l);
        System.out.println("Max Profit in rod Cutting Problem :" + maxProfit);


    }

    private static int maxProfitRodCuttingProblem(int[] price, int p, int[] length, int l) {
        int t[][] = new int[p + 1][l + 1];

        for (int i = 0; i < p + 1; i++) {
            for (int j = 0; j < l + 1; j++) {
                //Initialization :- First row and first column if wt is 0 and arr size is 0 antherefore max profit is 0
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else {
                    if (length[i - 1] <= j)  //Imp
                        t[i][j] = Math.max(price[i - 1] + t[i][j - length[i - 1]],
                                t[i - 1][j]  //Unbounded Knapsack Code  : i
                        );
                    else
                        t[i][j] = t[i - 1][j];

                }
            }

        }
        return t[p][l];  //i is length of price(input) &&  j is Max Capacity
    }
}
