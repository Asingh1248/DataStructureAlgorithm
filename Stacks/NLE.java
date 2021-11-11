import java.util.*;

public class Solution {
   
 public static void NLE(int arr[], int N ){
    Stack<Integer> stk = new Stack<>();
    List<Integer> ans=new ArrayList<>();
    
    for(int i=N-1;i>=0;i--){
        if(stk.isEmpty()){
            ans.add(-1);
            stk.push(arr[i]);
            System.out.println("stk.isEmpty(): "+stk);
        }
        else if(!stk.isEmpty() && arr[i]<stk.peek()){
            ans.add(stk.peek());
            stk.push(arr[i]);
            System.out.println("arr[i]<stk.peek(): "+stk);
        }
        else if(!stk.isEmpty() && arr[i]>stk.peek()){
            System.out.println("arr[i]>stk.peek(): "+stk);
            while(!stk.isEmpty() && arr[i]>=stk.peek()){
               stk.pop();
            }
            if(stk.isEmpty()){
                ans.add(-1);
            }
            else if( arr[i]<stk.peek()){
                ans.add(stk.peek());
                stk.push(arr[i]);
            }
        }
    }
    Collections.reverse(ans);
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