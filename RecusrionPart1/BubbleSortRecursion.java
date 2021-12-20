package RecusrionPart1;

import java.util.Arrays;

public class BubbleSortRecursion {


    public static void main(String[] args) {

        int arr[] = {1,5,0,2};
        sortRecurse(arr,arr.length);
        System.out.println("After sorting ");
        //System.out.println(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));

    }

    private static void sortRecurse(int[] arr, int length) {
         if(length==1)
             return;
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<length-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }


        // Largest element is fixed,
        // recur for remaining array
        sortRecurse(arr,length-1);


        }



    }

