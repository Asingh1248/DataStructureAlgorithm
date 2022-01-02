package DynamicProgrammingPart3;

public class RecursiveLCS {

    public static void main(String[] args) {
        String X ="abcdgh";
        String Y ="abedfhr";

        int n = X.length();
        int m= Y.length();

        char [] x= X.toCharArray();
        char [] y =Y.toCharArray();

        int ans=longestCommonSubSequence(x,y,n,m);
        System.out.println("Longest Common Subsequence for String: " +X + " and " +Y + " is : " +ans);

    }

    private static int longestCommonSubSequence(char[] x, char[] y, int n, int m) {

        if(n==0  || m==0)
            return 0;

        if(x[n-1] == y[m-1])
            return 1+longestCommonSubSequence(x,y,n-1,m-1); //1 + Imp since last string added
        else
            return Math.max(longestCommonSubSequence(x,y,n-1,m),longestCommonSubSequence(x,y,n,m-1));


    }

}
