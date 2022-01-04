package DynamicProgrammingPart4;

public class MemoizedPalindromePartioning {

    public static int t[][]= new int[1001][1001];

    public static void main(String[] args) {
        String X = "nitik";

        // n| iti  | k;

        int n = X.length();

        char a[] = X.toCharArray();


        for(int x=0;x<1001;x++){
            for(int y=0;y<1001;y++){
                t[x][y]=-1;
            }
        }

        //1 .Finding i &j
        int i = 0;
        int j = n - 1;

        int minimumPartitionforSubstringPalindrome = solve(a, i, j);
        System.out.println("Minimum Partition for Substring Palindrome for String :" + X +" is "+minimumPartitionforSubstringPalindrome);

    }
    private static int solve(char[] a, int i, int j) {
        //BC
        if(i>=j){
            t[i][j]=0;
            return 0; //If String is Empty or Single element is present 0 partition required
        }

        //if String itself is Palindrome (iti )
        if(isPalindrome(a,i,j)==true) {
            t[i][j]=0;
            return 0;
        }

        if(t[i][j]!=-1){
            return t[i][j];
        }

        int mn=Integer.MAX_VALUE;

        //Step 3 : K scheme loop for i and j
        for(int k=i;k<=j-1;k++){

            int temp=solve(a,i,k)+solve(a,k+1,j)+1; // C3 condition
            mn=Math.min(temp,mn);

        }

        return t[i][j]=mn;

    }

    private static boolean isPalindrome(char[] a, int i, int j) {

        //Single element is always Palindrome of itself
        if(i==j){
            return true;
        }
        //No element is present
        if(i>j){
            return  false;
        }

        //Checking with 2 Pointer from first and last character
        while(i<j){
            if(a[i]!=a[j]){
                return false;//Anyone is mismatching then return false
            }
            i++;
            j--;
        }
        return true;
    }


}
