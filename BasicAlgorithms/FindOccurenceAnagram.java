FinAnaimport java.util.*;

public class Solution {
   
 public static int findOccurencesOfAnagram(String inputString,String patternString){
   int ans=0;
   Map<Character,Integer> patternStringCountMap  = new HashMap<>();
   int freq=0;
   for(int i=0;i<patternString.length();i++){
       
       if(patternStringCountMap.containsKey(patternString.charAt(i)))
         patternStringCountMap.put(patternString.charAt(i),patternStringCountMap.get(patternString.charAt(i))+1);
       else
         patternStringCountMap.put(patternString.charAt(i),1); 
           
    }
   System.out.println("Map of pattern: "+patternStringCountMap); 
   int count=0;
   count=patternStringCountMap.size();
   int i=0,j=0;
   int K=patternString.length();
   int N=inputString.length();
   char [] s = inputString.toCharArray();
   while(j<N){
       
     if(patternStringCountMap.containsKey(s[j])){
      patternStringCountMap.put(s[j],patternStringCountMap.get(s[j])-1);
      System.out.println("Map of pattern in loop: "+patternStringCountMap);       
        if(patternStringCountMap.get(s[j])==0)
           count--;
        System.out.println("Count is :"+count);   
     }  // Null pointer handle 'since x was encounter and we need to handle in if { if} and outer if was not while level loop'
     if(j-i+1<K)
         j++;
    // Else if was the game changer         
     else if(j-i+1==K){
          if(count==0)
            ans++;
          if(patternStringCountMap.containsKey(s[i])){
              patternStringCountMap.put(s[i],patternStringCountMap.get(s[i])+1);
           if(patternStringCountMap.get(s[i])==1)
             count++;
          }      
           j++;
           i++;
      }     
       
   }
   
   return ans;
 }  
     
        
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   //System.out.println("Enter the String and pattern String");
    String inputString=sc.nextLine();
    String patternString=sc.nextLine();
    System.out.println("Input String "+inputString + " and pattern String "+patternString);
    int ans=findOccurencesOfAnagram(inputString,patternString);
    System.out.println("Answer is "+ans);

}
}