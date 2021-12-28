package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsetSumDiff {

    public static void main(String[] args) {
        int arr[] = {1, 2, 7};
        int n = arr.length;

        int range = 0;
        for (int i = 0; i < n; i++) {
            range += arr[i];
        }

        int ansMinDiff = minSubsetSumDiff(arr, n, range); //Method Design
        System.out.println("Minimum Subset Difference is :" + ansMinDiff);

    }

    private static int minSubsetSumDiff(int[] arr, int n, int range) {

        List<Integer> lastRowSubSetSumTrueIndexHalfway = new ArrayList<>();

        //Step 1 and Step 2 are here
        lastRowSubSetSumTrueIndexHalfway = isSubSetPossible(arr, n, range);


        System.out.println();
        System.out.println("lastRowSubSetSumTrueIndexHalfway :" + lastRowSubSetSumTrueIndexHalfway);

        //Step 3: Formula Derived Min(min,Range - 2S1)
        int min = Integer.MAX_VALUE; //Imp-v=ViceVersa
        int formula;

        for (int i = 0; i < lastRowSubSetSumTrueIndexHalfway.size(); i++) {
            formula = range - (2 * lastRowSubSetSumTrueIndexHalfway.get(i));
            //System.out.println("Formula value is " + formula);
            min = Math.min(min, formula);
        }
        return min;
    }

    private static List<Integer> isSubSetPossible(int[] arr, int n, int range) {
        List<Integer> lastRowSubSetSumTrueIndexHalfway = new ArrayList<>();
        boolean t[][] = new boolean[n + 1][range + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < range + 1; j++) {
                if (i == 0)
                    t[i][j] = false;
                if (j == 0)
                    t[i][j] = true;
            }
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < range + 1; j++) {
                if (arr[i - 1] <= j)   //arr[i-1]  :Array element for i-1 Actual element
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]]; // exclude or include
                else if (arr[i - 1] > j)
                    t[i][j] = t[i - 1][j]; //exclude

            }

        }


        //Step 1 :
        for (int j = 0; j < (range + 1) / 2; j++) {   //traversing the lastRow Hlaf only
            System.out.print(+j + "" + t[n][j] + " ");

            //Step 2:
            if (t[n][j] == true)
                lastRowSubSetSumTrueIndexHalfway.add(j);
        }
      return  lastRowSubSetSumTrueIndexHalfway;
    }
}
