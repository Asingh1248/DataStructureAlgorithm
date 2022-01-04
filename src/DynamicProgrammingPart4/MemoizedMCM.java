package DynamicProgrammingPart4;

public class MemoizedMCM {

    public static int t[][] =new int[1001][1001];

    public static void main(String[] args) {

        int arr[] = new int [] {10,30,5,60};
        int n=arr.length;

        //Step 1: Finding i &j

        int i=1;
        int j=n-1;

        for(int a=0;a<1001;a++){
           for(int b=0;b<1001;b++){
               t[a][b]=-1;
           }
        }

        int costOfMultiplication =solve(arr,i,j);
        System.out.println("Cost Of Multiplication :"+costOfMultiplication);
    }

    private static int solve(int[] arr, int i, int j) {
        if(i>=j) {
            t[i][j]=0;
            return 0;
        }
        if(t[i][j]!=-1)
            return t[i][j];

        int mn=Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){

            int temp= solve(arr,i,k)+solve(arr,k+1,j)
                     + arr[i-1]*arr[k]*arr[j];
            mn=Math.min(mn,temp);
        }
        return t[i][j]=mn;
    }

}
