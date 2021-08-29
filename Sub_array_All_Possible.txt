import java.util.ArrayList;
import java.util.*;
public class Solution {

    public static int subArrayCount(ArrayList < Integer > arr, int k) {
        
        int size =arr.size(); 
        // Prefix Sum Array
    	ArrayList<Integer> p = new ArrayList<Integer>(); 
       // System.out.println("Prefix Sum Array is: "+arr);

        int ans=0;
//         2 3 1
        int sum =0;

        p.add(0);
        for(Integer pvalues:arr)
        {
            sum +=pvalues;
            p.add(sum);
        }  
        


        for (int l=0;l<=p.size()-2;l++){
            //Inner loop : Prefix Sum --> Right Pointer 
            for(int r=l+1;r<=p.size()-1;r++ ){
                  int currsum=0;
                  currsum = p.get(r)-p.get(l);
                   // 2 5 6 3 4 1
                    
                   //System.out.println("Current Sum: "+currsum);
                  if(currsum%k==0){
                      ans++;
                  }
                }
            }
         return ans;
        // Write your code here.
    }
    
}

Outer loop
0 2 5 6
    l

Innerloop
0 2 5 6
      r  
  	
2-0 =2
5-0=5
6-0=6

5-2=3
6-2=4

6-5=1


15 
1 2 3 4 5 6 
21-1
l= r 
 sum[l,r] = prefix[r] - prefix[5] 
              15   - 1 (l-1)
               14
   =6 

  [1,3,6,10,15,21]