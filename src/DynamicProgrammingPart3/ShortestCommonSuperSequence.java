package DynamicProgrammingPart3;


public class ShortestCommonSuperSequence {


    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";

        char a[] = X.toCharArray();
        char b[]=Y.toCharArray();

        int m = X.length();
        int n = Y.length();

        int LCS= TopDownApproachLCS.LCSTopDown(a,b,m,n);
        System.out.println("Length of Longest Common Subsequence :"+LCS);

        int SCSS=(m+n)-LCS;

        System.out.println("Length of ShortestCommonSuperSequence for String :" +X+ " and "+Y+ "is :"+SCSS);


    }

}
