package ArraysAndAlgorithm4;

/*
* Method 1 (Brute Force)
If the length of string is n, then there can be n*(n+1)/2 possible substrings. A simple way is to generate
* all the substring and check each one whether it has exactly k unique characters or not.
* If we apply this brute force, it would take O(n2) to generate all substrings and O(n)
* to do a check on each one. Thus overall it would go O(n3).
*
* Method 2 (Hash Map)
We can further improve this solution by creating a hash table
*  and while generating the substrings, check the number of unique characters using that hash table. Thus it would improve up to O(n2).
*
* */

public class LongestSubStringKUniqueCharcaterBruteForce {
}
