package DynamicProgrammingPart2;

public class UnboundedKnapSack {

    public static void main(String[] args) {
        //Same as 0/1 Knapsack but Multiple Cccurence of items.
        int w = 7;

        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int n = wt.length;

        int maxprofit = unboundedKnapSack(wt, val, w, n);
        System.out.println(" UnboundedKnapSack Max Profit using Bottom Up Approach:" + maxprofit);

    }

    private static int unboundedKnapSack(int[] wt, int[] val, int w, int n) {
        //Code here

        return 1;


    }

}
