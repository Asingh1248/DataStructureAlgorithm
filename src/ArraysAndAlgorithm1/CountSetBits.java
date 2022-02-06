package ArraysAndAlgorithm1;

public class CountSetBits {
    public static void main(String[] args) {
        int a = 13;
        int b = 4;

        System.out.print(FlippedCount(a, b));
    }

    private static int FlippedCount(int a, int b) {
        // Return count of set bits in
        // a XOR b
        int XOR = a^b;
        System.out.println("XOR is : "+XOR);
        return countSetBits(a ^ b);
    }

    private static int countSetBits(int n) {

        System.out.println("Integer n is : "+n);
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
            System.out.println("After AND n is : "+n);
        }
        return count;
    }

}


/* n =  9 (1001)
   count = 0

   Since 9 > 0, subtract by 1 and do bitwise & with (9-1)
   n = 9&8  (1001 & 1000)
   n = 8
   count  = 1

   Since 8 > 0, subtract by 1 and do bitwise & with (8-1)
   n = 8&7  (1000 & 0111)
   n = 0
   count = 2

   Since n = 0, return count which is 2 now.
*
*
*
*
* */
