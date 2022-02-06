package ArraysAndAlgorithm4;


import ArraysAndAlgorithm3.FirstOccurenceofAnagram;

import java.util.HashMap;
import java.util.Map;


/*
* "aabbcc", k = 3
There are substrings with exactly 3 unique characters
{"aabbcc" , "abbcc" , "aabbc" , "abbc" }
Max is "aabbcc" with length 6.
*
* "aabbcc", k = 2
Max substring can be any one from {"aabb" , "bbcc"}.
* */

public class LongestSubStringKUniqueCharacter {
    public static void main(String[] args) {

        String input = "aabbcc";
        int K = 2;
        System.out.println("Input String is :"+input);
        System.out.println("No of Unique Character is :"+K);
        int ans = kUnique(input, K);
        System.out.println("Longest subString with K Unique Characters is :" + ans);
    }


    public static int kUnique(String input, int K) {

        int N = input.length();
        int ans = 1;
        Map<Character, Integer> mapChar = FirstOccurenceofAnagram.prepareMapForString(input);
        System.out.println("Map of the input String is :" + mapChar);
        int conditionSize = mapChar.size();  //Denotes Unique Charcater in Map
        int j = 0, i = 0;
        while (j < N) {

            if (conditionSize < K)  //If Unique Character is less than K
            {
                conditionSize = mapChar.size();
                j++;
            } else if (conditionSize == K)  // k=3 = size of Unique Character
            {
                ans = Math.max(ans, j - i + 1); //Maximum window size
                System.out.println(" conditionSize==K :Map of the input String is :" + mapChar);
                j++;
            } else if (conditionSize > K) {   // No of Unique charcater is map > K
                while (conditionSize > K) {
                    mapChar.put(input.charAt(i), mapChar.get(input.charAt(i)) - 1); //Subtract the count of charcater
                    System.out.println("conditionSize>K : Map of the input String is :" + mapChar);
                    if (mapChar.get(input.charAt(i)) == 0) { // If zero
                        mapChar.remove(input.charAt(i)); // Removes thec harcater
                        conditionSize = mapChar.size(); // Reinitialize the size
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
