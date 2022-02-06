package ArraysAndAlgorithm3;

/*
* Input : forxxorfxdofr
        for
Output : 3
Explanation : Anagrams of the word for - for, orf,
ofr appear in the text and hence the count is 3.

*
* An anagram of a string is another string that contains the same characters, only the order of characters can be different.
*  For example, “abcd” and “dabc” are an anagram of each other.
* */

import java.util.HashMap;
import java.util.Map;

public class FirstOccurenceofAnagram {

    public static void main(String[] args) {

        String inputString="forxxorfxdofr";
        String patternString="for";
        System.out.println("Input String "+inputString + " and pattern String "+patternString);
        int ans=findOccurencesOfAnagram(inputString,patternString);
        System.out.println("Answer is "+ans);
    }

    private static int findOccurencesOfAnagram(String inputString, String patternString) {
        int ans=0;

        Map<Character,Integer> pMap = prepareMapForString(patternString);
        System.out.println(pMap);
        int i =0;
        int j =0;

        int K =patternString.length();
        int n = inputString.length();
        int size = pMap.size();
        char [] s = inputString.toCharArray();
        while(j<n){
            if(pMap.containsKey(s[j])) {
                pMap.put(s[j], pMap.get(s[j]) - 1);
                if (pMap.get(s[j]) == 0)
                    size--;
            }
            if(j-i+1<K)
                    j++;
            else if(j-i+1==K) {
                if (size == 0)
                    ans++;
                if (pMap.containsKey(s[i])) {
                    pMap.put(s[i], pMap.get(s[i]) + 1);
                    if (pMap.get(s[i]) == 1)
                        size++;
                }
                j++;
                i++;
            }
      }
     return ans;
    }


    public static Map<Character, Integer> prepareMapForString(String patternString) {
        Map<Character,Integer> patternStringCountMap  = new HashMap<>();
        for(int i=0;i<patternString.length();i++){

            if(patternStringCountMap.containsKey(patternString.charAt(i)))
                patternStringCountMap.put(patternString.charAt(i),patternStringCountMap.get(patternString.charAt(i))+1);
            else
                patternStringCountMap.put(patternString.charAt(i),1);

        }
        return  patternStringCountMap;
    }
}
