package Strings;

/*
* ‘S’ = “bacda” and ‘K’ = 3.

So, the substrings having at most ‘3’ distinct characters are called good substrings.
* Some possible good substrings are:
1. “bac”
2. “acd”
3. “acda”

The substring “acda” is the largest possible good substring, as we cannot get any other substring of length 5 or
* more having distinct characters less than or equal to ‘3’. Thus, you should return ‘4’ as the answer.
*
*
* */

public class LongestSubStringWithKDistinctCharacters {

    public static void main(String[] args) {

        String input ="bacda";
        int K =3;
        int ans = getLengthofLongestSubstring(input,K);
        System.out.println(ans);
    }

    private static int getLengthofLongestSubstring(String s, int k) {
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

    private static boolean check(String subString, int k) {
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

}
