package Stacks2;

import java.util.*;

public class NearestSmallerToRight {

    public static void main(String[] args) {
        int arr [] = {4,5,2,10,8};
        System.out.println("Input Array is :"+ Arrays.toString(arr));
        int n = arr.length;

        List<Integer> ans = NSR(arr,n);
        System.out.println("Answer is :"+ans);

    }

    public static List<Integer> NSR(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            //Part 1
            if(stk.isEmpty()){
                ans.add(-1);
                stk.push(arr[i]);
            }
            //Part 2:
            else if(!stk.isEmpty() && arr[i]>stk.peek()){
                ans.add(stk.peek());
                stk.push(arr[i]);
            }
            //Part 3
            else if(!stk.isEmpty() && arr[i]<stk.peek()){
                while(!stk.isEmpty() && arr[i]<stk.peek()){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ans.add(-1);
                    stk.push(arr[i]);
                }
                else if(arr[i]>stk.peek()){
                    ans.add(stk.peek());
                    stk.push(arr[i]);
                }
            }

        }
        Collections.reverse(ans);
        return ans;
    }

}
