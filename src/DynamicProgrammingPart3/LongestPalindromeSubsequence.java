package DynamicProgrammingPart3;

public class LongestPalindromeSubsequence {

    public static void main(String[] args) {

         String X="agbcba";

         char a[]=X.toCharArray();
         int m= X.length();

         //Derive from Input String

         String reverseString= reverse(X);
         int n =reverseString.length();
         char reverseCharArray[]=reverseString.toCharArray();

         int LPSlength = TopDownApproachLCS.LCSTopDown(a,reverseCharArray,m,n);
         System.out.println("LPS length :"+LPSlength);


    }

    private static String reverse(String X) {
        StringBuilder s= new StringBuilder();
        s.append(X);
        String revereseX= s.reverse().toString();
        System.out.println("Reverse of Input String "+X + " is "+revereseX);
        return revereseX;
    }

}
