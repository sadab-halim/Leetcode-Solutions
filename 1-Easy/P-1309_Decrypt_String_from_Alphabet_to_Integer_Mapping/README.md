## [Decrypt String from Alphabet to Integer Mapping](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/)

You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows: <br/>
- Characters ('a' to 'i') are represented by ('1' to '9') respectively.
- Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

Return the string formed after mapping.

*Example-1* 
```
*Input:* s = "10#11#12"
*Output:* "jkab"
*Explanation:* "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
```

*Example-2*
```
Input: s = "1326#" 
Output: "acz" 
```