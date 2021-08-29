public class Solution {
    
    public static boolean check(String subString,int k){
        
        int arr[]=new int[26];
        for(int i=0;i<subString.length();i++){
             //arr[i]++
              arr[subString.charAt(i)-'a']++;     
        }
        
        int distinct=0;
        for(int i=0;i<26;i++){
            //System.out.println(arr[i]);
            if(arr[i]>0){
                distinct++;
                
            }
        }
       //System.out.println(distinct); 
       return distinct<=k;
    }
    
	public static int getLengthofLongestSubstring(String s, int k) {
		// Write your code here.
        int len=s.length();
        int longestSize=0;
        for(int i=0;i<len-1;i++){
            String subString="";
            for(int j=i;j<len;j++){
                subString+=s.charAt(j);
                //System.out.println("All Possible SubString :"+subString);   
               
                if(check(subString,k)){
                   longestSize=Math.max(longestSize,j-i+1);
                   //System.out.println("Longest Size :"+longestSize);
                }       
            } 
        }
        
        return longestSize;
	}
}