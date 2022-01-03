package DynamicProgrammingPart3;

public class LongestRepeatingSubsequence {

    public static void main(String[] args) {
        String input= "AABEBCDD";

        String derived= input;
        System.out.println("Derived String :"+derived);

        int m=input.length();
        int n=derived.length();

        char a[]=input.toCharArray();
        char b[]=derived.toCharArray();

        int ans = longestRepeatingSubsequence(a,b,m,n);

        System.out.println("Length of longest Repeating Subsequence :"+ans);


    }

    private static int longestRepeatingSubsequence(char[] a, char[] b, int m, int n) {
        int t[][] = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){

                if(i==0 || j==0){
                    t[i][j]=0;
                }

            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){

                if(a[i-1] == b[j-1] && i!=j){   //V.Imp Step
                    t[i][j]=1+t[i-1][j-1];
                }
                else
                {
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }

        return t[m][n];

    }
}
