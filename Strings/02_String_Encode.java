import java.util.*;
public class Solution {
	public static String encode(String message) {
		// Write your code here.
        
        StringBuilder sb = new StringBuilder(message);
        
        Map<Character,Integer> hmap = new HashMap<Character,Integer>();
        int count=1;
        for(int i=0;i<sb.length();i++){ 
            if(hmap.containsKey(sb.charAt(i))){
               hmap.put(sb.charAt(i),hmap.get(sb.charAt(i))+1);
             }
            else if(!hmap.containsKey(sb.charAt(i))) {
                hmap.put(sb.charAt(i),count);
            }
        }
        
        //System.out.println("Result is :"+hmap);
        
        StringBuilder encode = new StringBuilder();
        for(Map.Entry<Character,Integer> entry:hmap.entrySet()){
            encode.append(entry.getKey());
            encode.append(entry.getValue());
        }
        
        //System.out.println("Encoded String :"+encode.toString());
        return encode.toString();
        
	}
}