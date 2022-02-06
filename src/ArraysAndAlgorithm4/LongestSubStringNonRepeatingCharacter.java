package ArraysAndAlgorithm4;

import java.util.HashMap;
import java.util.Map;

/*
Similar to K Unique character but here All Uniuqe chracter hence k= j-i+1 (Winodw Size) and prepartaion of
Map in while loop itself
* */

public class LongestSubStringNonRepeatingCharacter {
    public static void main(String[] args) {
        String input="pwwkew";
        System.out.println("Input String is : "+input);
        int ans=AllUnique(input);
        System.out.println("Longest subString with No repeating Characters is :"+ans);
    }

    private static int AllUnique(String input) {
        int N=input.length();
        int ans=1;
        Map<Character,Integer> mapChar = new HashMap<>();
        int mapSize;
        int windowSize;
        int j=0,i=0;
        while(j<N){
            if(mapChar.containsKey(input.charAt(j))){
                mapChar.put(input.charAt(j),mapChar.get(input.charAt(j))+1);
            }
            else{
                mapChar.put(input.charAt(j),1);
            }
            mapSize=mapChar.size();
            System.out.println("Map of the input String  with unique character is :"+mapChar);
            if(mapSize>j-i+1){  // Here K is j-i+1
                mapSize=mapChar.size();
                System.out.println("mapSize > windowSize Map of the input String is :"+mapChar);
                j++;
            }
            else if (mapSize==j-i+1){
                ans=Math.max(ans,j-i+1);
                System.out.println("mapSize==windowSize :Map of the input String is :"+mapChar);
                j++;
            }
            else if (mapSize<j-i+1){
                while(mapSize<j-i+1){
                    mapChar.put(input.charAt(i),mapChar.get(input.charAt(i))-1);
                    System.out.println("mapSize<windowSize : Map of the input String is :"+mapChar);
                    if(mapChar.get(input.charAt(i))==0){
                        mapChar.remove(input.charAt(i));
                        mapSize=mapChar.size();
                    }
                    i++;
                }
                j++;
            }
          }
        return ans;
        }

}
