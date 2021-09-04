import java.util.*;

public class Solution {
   
 public static int kUnique(String input,int K){
    
      int N=input.length();
      int ans=1;
      Map<Character,Integer> mapChar = new HashMap<>();
      for(int i=0;i<N;i++){
       if(mapChar.containsKey(input.charAt(i))){
          mapChar.put(input.charAt(i),mapChar.get(input.charAt(i))+1); 
        }
        else{
          mapChar.put(input.charAt(i),1);
        }
     }
     System.out.println("Map of the input String is :"+mapChar);
     int conditionSize=mapChar.size();
     int j=0,i=0;
     while(j<N){
         if(conditionSize<K){
            conditionSize=mapChar.size(); 
            j++;    
         }  
         else if (conditionSize==K){
             ans=Math.max(ans,j-i+1);
             System.out.println(" conditionSize==K :Map of the input String is :"+mapChar);
             j++;
         }
         else if (conditionSize>K){
             while(conditionSize>K){
                mapChar.put(input.charAt(i),mapChar.get(input.charAt(i))-1);
                System.out.println("conditionSize>K : Map of the input String is :"+mapChar);
                if(mapChar.get(input.charAt(i))==0){
                    mapChar.remove(input.charAt(i));
                    conditionSize=mapChar.size(); 
                }
                i++;
             }
             j++;
         }
          
      }
      return ans;
 }  
     
        
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String input=sc.nextLine();
    int K =sc.nextInt();
    System.out.println("Input String is : "+input + " No of K:"+K);

    
    int ans=kUnique(input,K);
    System.out.println("Longest subString with K Unique Characters is :"+ans);

}
}