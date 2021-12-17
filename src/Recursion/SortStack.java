package Recursion;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(0);
        stk.push(15);
        stk.push(0);
        stk.push(2);

        System.out.println("Before Sorting the stack : "+stk);
        sortingStack(stk);

        System.out.println("After Sorting the stack : "+stk);


    }

    private static void sortingStack(Stack<Integer> stk) {
        if(stk.size()==1)
            return;
        int temp = stk.peek();
        stk.pop(); //I have to remove it
        sortingStack(stk);
        insert(stk,temp);
        return;


    }

    private static void insert(Stack<Integer> stk, int temp) {
        if(stk.size()==0  || stk.peek()<=temp){
            stk.push(temp);
            return;
        }
        int val = stk.peek();
        stk.pop();

        insert(stk,temp);
        stk.push(val);
        return;
    }
}
