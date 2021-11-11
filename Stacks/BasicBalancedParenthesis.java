import java.util.*;

public class Solution {
   
 public static void parenthesis(String s){
    Stack<Integer> stk = new Stack<>();
    char [] chars= s.toCharArray();
    for(int i=0;i<chars.length;i++){
        
        if(chars[i]=='('){
            stk.push(i);
            System.out.println(stk);
        }else if(chars[i]==')'){
            //First case : start )((
            if(stk.size()==0){
              System.out.println("Unbalanced parenthesis");
              System.out.println("If Stack Emoty :"+stk);
            } 
            else{
                stk.pop();
                System.out.println("After popping from stack: "+stk);
            }        
        }
        
    }
        
}
  
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println("Input is "+input);
    parenthesis(input);    
 }

}