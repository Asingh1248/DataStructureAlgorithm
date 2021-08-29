import java.util.*;

 


public class Solution {
    
    public static class Pair{
        int a,b,c;
        
         Pair(int x,int y,int z){
            a=x;
            b=y;
            c=z;
        }
        
        public boolean equals(Object o) {
        if (o instanceof Pair) {
            Pair p = (Pair) o;
            return p.a == a && p.b == b && p.c == c;
        }
        return false;
    }

      public int hashCode() {
         return new Integer(a).hashCode() * 31 + new Integer(b).hashCode() * 32 + new Integer(c).hashCode();
      }
        
        
    }
    
    
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
        HashSet<Pair> visited= new HashSet<Pair>();
     
        int flag=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
               for(int k=j+1;k<n;k++){
                   int sum=arr[i]+arr[j]+arr[k];
                   System.out.println("Sum of Triplet :"+sum);
                   if(sum==K){   
                      ArrayList<Integer> stepSum= new ArrayList<>();  
                      stepSum.add(arr[i]); 
                      stepSum.add(arr[j]);
                      stepSum.add(arr[k]);
                   
                   Collections.sort(stepSum);
                   System.out.println("List of Sum :"+stepSum);
//                     ans.add(stepSum);
//                      System.out.println("Answer List :"+ans);    
                   if(!visited.contains(new Pair(stepSum.get(0),stepSum.get(1),stepSum.get(2)) ) ){
                      flag=1;
                      ans.add(stepSum); 
                      //System.out.println("Answer List :"+ans); 
                      visited.add(new Pair(stepSum.get(0),stepSum.get(1),stepSum.get(2) )); 
                   }
                 }       
               }   
            }
  
        }
        return ans;
	}
}
