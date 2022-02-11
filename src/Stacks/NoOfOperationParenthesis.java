package Stacks;

import java.util.Stack;

public class NoOfOperationParenthesis {
    public static void main(String[] args) {
        //String input ="((())(";
        String input=")()";
        System.out.println("Input is "+input);
        NoOfOperationParenthesisCount(input);
    }

    private static void NoOfOperationParenthesisCount(String s) {
        Stack<Integer> stk = new Stack<>();
        char [] chars= s.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++){

            if(chars[i]=='('){
                stk.push(i);
                System.out.println(stk);
            }else if(chars[i]==')'){
                //First case : start )((
                if(stk.size()==0){
                    System.out.println("Unbalanced parenthesis");
                    count++;
                    System.out.println("If Stack Empty :"+stk);
                }
                else{
                    stk.pop();
                    System.out.println("After popping from stack: "+stk);
                }
            }

        }

        // while(stk.size()>0){
        //     count++;
        // }

        count+=stk.size();

        System.out.println("No of bracket or operations performed to make it valid "+count);

    }

}
