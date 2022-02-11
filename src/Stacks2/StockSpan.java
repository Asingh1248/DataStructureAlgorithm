package Stacks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        int arr [] = {100,80,60,70,60,75,85};
        int n = arr.length;
        System.out.println("Input Array is :"+ Arrays.toString(arr));

        //Nearest Greater to Left
        // Stack : Key is actual element and value is index of that element
        Stack<Pair> stk = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(stk.isEmpty()){
                ans.add(-1);
                stk.push(new Pair(arr[i],i));
//                System.out.println("In 1st condition stack is :"+stk);
            }
            else if (!stk.isEmpty() && arr[i]<stk.peek().getKey()){
                ans.add(stk.peek().getValue());
                stk.push(new Pair(arr[i],i));
//                System.out.println("In 2nd condition stack is :"+stk);
            }
            else if(!stk.isEmpty() && arr[i]>stk.peek().getKey())
            {
                while(!stk.isEmpty() && arr[i]>stk.peek().getKey()){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ans.add(-1);
                    stk.push(new Pair(arr[i],i));
                }
                else if(arr[i]<stk.peek().getKey()){
                    ans.add(stk.peek().getValue());
                    stk.push(new Pair(arr[i],i));
                }
//                System.out.println("In 3rd condition stack is :"+stk);
            }
        }

        System.out.println("Index of element nearest greater to left :"+ans);

        for(int i =0;i<n;i++){
            ans.set(i,i-ans.get(i));
        }

        System.out.println("Number of consecutive smaller or equal to nos to left :"+ans);


    }

}
