package ArraysAndAlgorithms;
/*
* 1 2 3
    1 3

* Answer : 6
*
* the given array A is [1,2,3] therefore the infinite array “B” will be [1,2,3,1,2,3,1,2,3,.......].
* So the answer for the given first query is 6 because the sum of the
* subarray from index 1 to 3 of infinite array “B” i.e. (B[1]+B[2]+B[3]) is 6.
*
*  1 5
* Answer : 9
*   For the given second query is 9
*  because the sum of the subarray from index 1 to 5 of array “B” .ie (B[1]+B[2]+B[3]+B[4]+B[5]) is 9.
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfInfiniteArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        //[[1,3],[1,5]]
        List<List<Long>> queries = new ArrayList<>();
        List<Long> element = new ArrayList<>();
        element.add(1L);
        element.add(3L);
        List<Long> element2 = new ArrayList<>();
        element2.add(1L);
        element2.add(5L);

        queries.add(element);
        queries.add(element2);

        System.out.println("Input Arrays is :" + Arrays.toString(arr));
        System.out.println("Given Input Queries  is :" + queries);
        List<Integer> answer = sumInRanges(arr, n, queries, 2);
        System.out.println("Answer is :" + answer);

    }

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        long l = 0, r = 0;
        List<Integer> answer = new ArrayList<Integer>();
        for (List<Long> result : queries) {
            l = result.get(0) - 1;
            r = result.get(1) - 1;
            System.out.println("Calculating for index : "+l + " and "+r);

            long sum = 0;
            for (long i = l; i <= r; i++) {
                int index = (int) i % n;  //Imp
                System.out.println(index);
                sum += arr[index];
                System.out.println(sum);

            }
            answer.add((int) sum);

        }
        return answer;
    }
}
