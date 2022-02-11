package Stacks;

import java.util.Stack;

public class BasicBalancedParenthesis {

    public static void main(String args[]){

        //String input ="((())(";
        String input=")()";
        System.out.println("Input is "+input);
        parenthesis(input);
    }

    private static void parenthesis(String s) {
        Stack<Integer> stk = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                stk.push(i);
                System.out.println(stk);
            } else if (chars[i] == ')') {
                //First case : start )((
                if (stk.size() == 0) {
                    System.out.println("Unbalanced parenthesis String");
                    return;
                } else {
                    stk.pop();
                    System.out.println("After popping from stack: " + stk);
                }
            }


        }
        if(!stk.isEmpty()){
            System.out.println(s + " String is Unbalanced");
        }
        else{
            System.out.println(s + " String is Balanced");
        }
    }
}
