## [Valid Anagram](https://leetcode.com/problems/valid-anagram/)

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

*Example-1*: <br/>
*Input:* s = "anagram", t = "nagaram" <br/>
*Output:* true <br/>

*Example-2:* <br/>
*Input:* s = "rat", t = "car" <br/>
*Output:* false <br/>

### Solution
```
public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> sMap = new HashMap<>();
        
        for(char c: s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c,0)+1);
        }
        
        for(char c: t.toCharArray()){
            if(!sMap.containsKey(c) || sMap.get(c)==0) {
                return false;
            } else {
                sMap.put(c, sMap.get(c)-1);
            }
        }
        return true;
    }
```