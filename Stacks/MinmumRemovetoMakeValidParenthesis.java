import java.util.*;

public class Solution {
   
 public static String parenthesis(String s){
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
    
    //Remining the element in stack is also inavlid
    
    while(stk.size()>0){
        chars[stk.pop()]='.';
    }
   
   StringBuilder sb = new StringBuilder();
   for(char c : chars){
       if(c!='.'){
           sb.append(c);
       }
   }
      
  return sb.toString();        
}
  
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    //ab)cd((e)((f
    String input = sc.nextLine();
    System.out.println("Input is "+input);
    String ans=parenthesis(input);  
    System.out.println("Answer is "+ans);
    
 }

}