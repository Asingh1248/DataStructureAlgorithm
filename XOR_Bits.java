class Count {
     
    // Function that count set bits
    public static int countSetBits(int n)
    {
        System.out.println("Integer n is : "+n);
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
            System.out.println("After AND n is : "+n);
        }
        return count;
    }
 
    // Function that return count of
    // flipped number
    public static int FlippedCount(int a, int b)
    {
        // Return count of set bits in
        // a XOR b
        int XOR = a^b;
        System.out.println("XOR is : "+XOR);
        return countSetBits(a ^ b);
    }
     
    // Driver code
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.print(FlippedCount(a, b));
    }
}