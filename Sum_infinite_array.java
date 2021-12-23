import java.util.*;

public class Solution {
  
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
         
        long l =0,r= 0;
        for(List<Long> result :queries)
        {
            l = result.get(0)-1;
           // System.out.println(l);
            r = result.get(1)-1;
           // System.out.println(r);
        }   
        
        List<Integer> answer = new ArrayList<Integer>();
        long sum=0;
        for (long i=l;i<=r;i++)
        {
            sum+=arr[(int)i];
            
        }
       answer.add((int)sum);
       return answer; 
        
        
        
        
        // Write your code here!

    }
}