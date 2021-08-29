package Phase1;

import java.util.Scanner;

public class JioStack {

    public static void main (String args []){

       // System.out.println("Hello World");

        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        for (int i = 1;i<=T;i++){
            String str=sc.nextLine();
            balanceparenthesis(str);

        }


    }

    private static void balanceparenthesis(String str) {
        str.replace("}}",")");
        System.out.println("After replacement  :"+str);

    }


}
