import java.util.*;

public class Solution {
   
 public static void NLE(int arr[], int N ){
    //Hvae to do without Stack Pair since there was no package javafx.util does not exist. 
    Stack<Integer> stk = new Stack<>();
    List<Integer> ans=new ArrayList<>();
    stk.push(0);
    ans.add(-1);
    
    //Nearest Greatest to Left
    for(int i=1;i<N;i++){
        
          // Pop elements from stack while stack is not
            // empty and top of stack is smaller than
            // price[i]
            while(!stk.isEmpty() && arr[i]>=arr[stk.peek()]){
               stk.pop();
            }
             // If stack becomes empty, then price[i] is
            // greater than all elements on left of it, i.e.,
            // price[0], price[1], ..price[i-1].
            if(stk.isEmpty()){
                ans.add(i); 
            }
            //Else price[i]
            //is greater than elements after top of stack
            else if( arr[i]<arr[stk.peek()]){
                ans.add(stk.peek()); 
             
            }
            stk.push(i);
        }
        
        System.out.println("Index of number nearest greatest to left :"+ans);
        
        for(int i=0;i<N;i++){
            ans.set(i,i-ans.get(i));
        }
        System.out.println("Answer is :"+ans);
    }
  
     
        
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int [N];
    for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
        System.out.print(" " +arr[i]);
    }
    System.out.println();
    NLE(arr,N);    
 }

}