package DynamicProgrammingPart3;



public class PrintLCS {

    public static void main(String[] args) {

        String X = "acbcf";
        String Y = "abcdaf";

        int m= X.length();
        int n=Y.length();

        char a[]  = X.toCharArray();
        char b[]= Y.toCharArray();

        int LCSAns[][] = new int[m+1][n+1];

        LCSAns = LCS(a,b,m,n);
        System.out.println("DP  Matrix of Longest Common Subsequence for I/P String is : ");
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(LCSAns[i][j] + " ");
            }
            System.out.println();
        }

       String ans= printingLCS(LCSAns,a,b,m,n);
        System.out.println("LCS String :"+ans);

    }

    public static String printingLCS(int[][] lcsAns, char[] a, char[] b, int m, int n) {
        int i=m;
        int j=n;
        String ans ="";

        while(i>0 && j>0){
            if(a[i-1]==b[j-1]) {
                ans += a[i - 1];
                i--;
                j--;
            }
            else {
                if(lcsAns[i][j-1]>lcsAns[i-1][j])
                    j--;
                else
                     i--;
            }

        }
        System.out.println();
        System.out.println("LCS String in :"+ans);
        StringBuilder outputString = new StringBuilder(ans);
        return outputString.reverse().toString();

    }

    public static int[][] LCS(char[] a, char[] b, int m, int n) {
        int t[][] = new int[m+1][n+1];

        for(int i =0;i<m+1;i++){
            for(int j =0;j<n+1;j++){
                if(i==0  || j ==0)
                    t[i][j]=0;

            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(a[i-1]==b[j-1])
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        return  t;
    }
}
