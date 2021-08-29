import java.util.*;

public class Solution {
   
    public static List<Long> printFirstNegativeInteger(long arr[], int N, int K)
     {
        List<Long> ans = new ArrayList<Long>();
        Queue<Long> Di= new LinkedList<Long>(); 
        for(int i=0;i<K-1;i++){
           Di.add(arr[i]);  
        }  
        
        for(int i=K-1;i<N;i++){
            if(arr[i]<0){
                Di.add(arr[i]);
            }
            if(!Di.isEmpty()){
                ans.add(Di.peek());
                System.out.print(Di.peek() + " ");
                if(Di.peek()==arr[i-K+1]){
                    Di.remove();
                }
            }
            else{
                ans.add(0L);
            }
            
        }
        
        return ans;
        
        
     }    
     
        
 public static void main(String args[]){
    long inputArr []= new long[]{-8, 2, 3, -6, 10};
    int N=inputArr.length;
    int K=2;
    List<Long> ans = printFirstNegativeInteger(inputArr,N,K);
    System.out.println("Answer is "+ans);


}
}