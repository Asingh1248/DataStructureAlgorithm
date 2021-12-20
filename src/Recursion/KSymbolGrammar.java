package Recursion;

import java.sql.SQLOutput;

public class KSymbolGrammar {

    public static void main(String[] args) {
          int N = 4;
          int K = 3;

        System.out.println("N : "+N);
        System.out.println("K :"+K);

        int ans = solve(N,K);
        System.out.println("The bit value at Nth row: "+N+ " and " +K+ " Kth columns is : "+ans);



    }

    private static int solve(int n, int k) {
        if(n==1 && k==1) //Base Condition : Given
            return 0;
        int length = (int)Math.pow(2,n-1);
        int mid=length/2; //Pascal triangle

        if(k<=mid){
            return solve(n-1,k);  //First half for K its the same value
        }
        else{
            //return !solve(n-1,k-mid); //Second half for K its 1->5 2->6 and its complement
            return solve(n-1,k-mid)==0 ?1:0;
        }


    }
}
