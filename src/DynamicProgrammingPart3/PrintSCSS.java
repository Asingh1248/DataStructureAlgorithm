package DynamicProgrammingPart3;

public class PrintSCSS {

    public static void main(String[] args) {


//        String X ="abcdaf";
//        String Y = "acbcf";

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m= X.length();
        int n = Y.length();

        char a[] = X.toCharArray();
        char b [] =Y.toCharArray();

        int LCSAns[][] = new int[m+1][n+1];

        LCSAns = PrintLCS.LCS(a,b,m,n);


        System.out.println("DP  Matrix of Longest Common Subsequence for I/P String is : ");
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(LCSAns[i][j] + " ");
            }
            System.out.println();
        }

        String ans= printingSCSS(LCSAns,a,b,m,n);
        System.out.println("SCSS String :"+ans);

    }

    private static String printingSCSS(int[][] lcsAns, char[] a, char[] b, int m, int n) {
        int i=m;
        int j=n;

        String ans ="";

        while(i>0 && j>0){
            if(a[i-1]==b[j-1]){
                ans+=a[i-1];
                i--;
                j--;
            }
            else{
                if(lcsAns[i][j-1] >lcsAns[i-1][j]){
                    ans+=b[j-1];
                    j--;
                }
                else{
                    ans+=a[i-1];
                    i--;
                }

            }
        }

        //Coding for Stop Condition when j==0 since from above while cond either i or j will become 0

        while(i>0){
            ans+=a[i-1];
            i--;
        }

        while(j>0){
            ans+=b[j-1];
            j--;
        }

        StringBuilder reverseString = new StringBuilder();
        reverseString.append(ans);
        reverseString.reverse();

        return reverseString.toString();
    }


}
