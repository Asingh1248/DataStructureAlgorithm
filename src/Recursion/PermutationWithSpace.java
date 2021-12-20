package Recursion;

public class PermutationWithSpace {

    public static void main(String[] args) {
        String ip="ABC";
        String op="";

        op+=ip.charAt(0);
        ip=ip.substring(1);
        solve(op,ip);
    }

    private static void solve(String op, String ip) {

        if(ip.length()==0){
            System.out.println(op);
            return;
        }


        String op1=op;
        String op2=op;

        op1+="_";
        op1+=ip.charAt(0);

        op2+=ip.charAt(0);

        ip=ip.substring(1);

        solve(op1,ip);
        solve(op2,ip);
        return;


    }

}
