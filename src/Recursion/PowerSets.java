package Recursion;

public class PowerSets {

    public static void main(String[] args) {
        String ip ="ab";
        String op="";
        solve(ip,op);

    }

    private static void solve(String ip, String op) {

        if(ip.length()==0)
        {
            System.out.println(op);
            return;
        }

        String op1= op;
        String op2=op;
        op2+=ip.charAt(0);
        ip = ip.substring(1);

        solve(ip,op1);
        solve(ip,op2);
    }
}
