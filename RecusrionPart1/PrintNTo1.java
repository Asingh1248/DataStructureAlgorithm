package RecusrionPart1;


import java.util.Scanner;

public class PrintNTo1 {

    public static void main(String[] args) {

        int N;
        System.out.println("Enter the no N : ");
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        printreverse(N);

    }

    private static void printreverse(int n) {
        if(n==1)
            System.out.println(n);
        else {
            System.out.println(n);
            printreverse(n-1);
        }

    }
}
