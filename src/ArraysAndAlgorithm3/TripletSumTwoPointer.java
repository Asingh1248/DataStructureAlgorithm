package ArraysAndAlgorithm3;

import java.util.Arrays;

public class TripletSumTwoPointer {

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        System.out.println("Input Arrays is :"+ Arrays.toString(A));
        boolean b = find3NumbersTwoPointer(A, arr_size, sum);
        System.out.println("Triplet Sum found in input array :"+b);
    }

    private static boolean find3NumbersTwoPointer(int[] A ,int arr_size, int sum) {
        int l, r;

        /* Sort the elements */
        Arrays.sort(A);
        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < arr_size - 2; i++) {

            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = arr_size - 1; // index of the last element
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    System.out.println();
                    return true;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;

                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

}


