package ArraysAndAlgorithm3;

import java.util.Arrays;

public class TripletSumBruteForce {



    public static void main(String[] args)
    {

        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        System.out.println("Input Arrays is :"+ Arrays.toString(A));
        boolean b = find3Numbers(A, arr_size, sum);
        System.out.println("Triplet Sum found in input array :"+b);
    }

    private static boolean find3Numbers(int[] A, int arr_size, int sum) {
            int l, r;

            // Fix the first element as A[i]
            for (int i = 0; i < arr_size - 2; i++) {

                // Fix the second element as A[j]
                for (int j = i + 1; j < arr_size - 1; j++) {

                    // Now look for the third number
                    for (int k = j + 1; k < arr_size; k++) {
                        if (A[i] + A[j] + A[k] == sum) {
                            System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                            System.out.println();
                            return true;
                        }
                    }
                }
            }
      return false;
    }
}
