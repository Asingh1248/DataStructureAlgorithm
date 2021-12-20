package Recursion;

import java.util.Vector;

public class GenerateBalancedParenthesis {

    public static void main(String[] args) {

        int n = 2;
        int open ,close;
        close=open=n;

        String op = "";
        Vector<String> v = new Vector<String>();

        solve(open,close,op,v);

        System.out.println("Vector List of Balanced Parenthesis :"+v);
    }

    private static void solve(int open, int close, String op, Vector<String> v) {
        if(open== 0 && close==0){
            v.add(op);
            return;
        }

        String op1,op2 ;

        if(open!=0){
           op1=op;  // ( left side
           op1+='(';
           solve(open-1,close,op1,v);

        }

        if(close > open){
            op2=op;
            op2+=')';
            solve(open,close-1,op2,v);
        }

        return;
    }

}
