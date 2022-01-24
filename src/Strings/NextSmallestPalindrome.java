package Strings;

/*
* 1221
* The next smaller palindrome to 1221 is 1331,
* as it is strictly greater than 1221 and it reads the same from the front and back both.
* */


public class NextSmallestPalindrome {

    public static void main(String[] args) {
        int num = 526;  //If input is already palindrome it wont give me ans
        //int num= 1221 ; givce me this only outpt

        // If number is not Palindrome we go to the next
        // number using while loop
        while (isPalindrome(num) == 0) {
            num = num + 1;
        }

        // now we get the next Palindrome so let's print it
        System.out.print("Next Palindrome :");
        System.out.print(num);

    }

    static int isPalindrome(int num) {

        // Declaring variables
        int n, k, rev = 0;

        // storing num in n so that we can compare it later
        n = num;

        // while num is not 0 we find its reverse and store
        // in rev
        while (num != 0) {
            k = num % 10;
            rev = (rev * 10) + k;
            num = num / 10;
        }

        // check if num and its reverse are same
        if (n == rev) {
            return 1;
        } else {
            return 0;
        }
    }
}
























