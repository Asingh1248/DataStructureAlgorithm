package Stacks;

//String input ="ab)cd((e)((f";
//        Answer is abcd(e)f

import java.util.Arrays;
import java.util.Stack;


public class MinimumRemovetoMakeValidParenthesisForString {

    public static void main(String args[]){

        String input ="ab)cd((e)((f";
        System.out.println("Input is "+input);
        String ans=parenthesisToMakeValidParenthesis(input);
        System.out.println("Answer is "+ans);

    }

    private static String parenthesisToMakeValidParenthesis(String s) {
        Stack<Integer> stk = new Stack<>();
        char [] chars= s.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++){
            //Only '( 'is pushed
            if(chars[i]=='(')
                stk.push(i);
            else if(chars[i]==')'){
                if(stk.size()==0)
                    chars[i]='.';
                else
                    stk.pop();
            }
        }
        System.out.println("Character Array :"+ Arrays.toString(chars));
        System.out.println("Stack Array  is :"+stk);
        //Remaining the element in stack is also invalid

        while(stk.size()>0){
            chars[stk.pop()]='.';
        }
        System.out.println("After while looping ");
        System.out.println("Character Array :"+ Arrays.toString(chars));
        System.out.println("Stack Array  is :"+stk);

        System.out.println();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(c!='.'){
                sb.append(c);
            }
        }

        return sb.toString();

    }

}
