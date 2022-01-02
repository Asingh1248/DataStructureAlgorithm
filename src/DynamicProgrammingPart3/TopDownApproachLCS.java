package DynamicProgrammingPart3;

public class TopDownApproachLCS {


    public static void main(String[] args) {
        String X ="abcdgh";
        String Y ="abedfhr";

        char a[] = X.toCharArray();
        char b[] = Y.toCharArray();

        int m = X.length();
        int n = Y.length();

        int ans = LCSTopDown(a,b,m,n);

        System.out.println("LCS TopDown Approach for String: " +X + " and " +Y + " is : " +ans);


    }

    public static int LCSTopDown(char[] a, char[] b, int m, int n) {
       int t[][] = new int[m+1][n+1];

        for(int i=0; i<m+1;i++) {
            for (int j=0; j<n + 1; j++) {
                if(i==0  || j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
              if(a[i-1]==b[j-1]){    //When last character is sane (Loop we need check for all charcater
                  t[i][j]=1+t[i-1][j-1];
              }
              else
              {
               t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
              }
            }
        }

      return t[m][n];
    }

}
