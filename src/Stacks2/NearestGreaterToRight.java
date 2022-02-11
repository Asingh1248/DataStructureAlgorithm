package Stacks2;

import java.util.*;

//Nearest Greater to Right -->
public class NearestGreaterToRight {

    public static void main(String[] args) {
        int arr [] ={11, 13, 21, 3};
        System.out.println("Input Array is :"+ Arrays.toString(arr));
        int N =arr.length;
        NLE(arr,N);
    }

    private static void NLE(int[] arr, int N) {
        Stack<Integer> stk = new Stack<>();
        List<Integer> ans=new ArrayList<>();

        for(int i=N-1;i>=0;i--){
            if(stk.isEmpty()){
                ans.add(-1);
                stk.push(arr[i]);
                System.out.println("stk.isEmpty(): "+stk);
            } // execute first time only

            else if(!stk.isEmpty() && arr[i]<stk.peek()){
                ans.add(stk.peek());
                stk.push(arr[i]);
                System.out.println("arr[i]<stk.peek(): "+stk);
            }
            else if(!stk.isEmpty() && arr[i]>stk.peek()){
                System.out.println(arr[i] + " >" +stk.peek()+ " stk");
                while(!stk.isEmpty() && arr[i]>=stk.peek()){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ans.add(-1);
                    stk.push(arr[i]);
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

}
