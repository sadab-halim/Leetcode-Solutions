## [Merge Strings Alternatively](https://leetcode.com/problems/merge-strings-alternately/)
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

*Example-1* <br/>
*Input:* word1 = "abc", word2 = "pqr" <br/>
*Output:* "apbqcr" <br/>
*Explanation:* The merged string will be merged as so: <br/>
word1:  a   b   c <br/>
word2:    p   q   r <br/>
merged: a p b q c r <br/>

*Example-2* <br/>
*Input:* word1 = "ab", word2 = "pqrs" <br/>
*Output:* "apbqrs" <br/>
*Explanation:* Notice that as word2 is longer, "rs" is appended to the end. <br/>
word1:  a   b <br/>
word2:    p   q   r   s <br/>
merged: a p b q   r   s <br/>

*Example-3* <br/>
*Input:* word1 = "abcd", word2 = "pq" <br/>
*Output:* "apbqcd" <br/>
*Explanation:* Notice that as word1 is longer, "cd" is appended to the end. <br/>
word1:  a   b   c   d <br/>
word2:    p   q  <br/>
merged: a p b q c   d <br/>

### Solution
```
string mergeAlternately(string word1, string word2) {
        int wordLength = max(word1.size(), word2.size());
        string res = "";
        for(int i=0; i<wordLength; i++){
            if(i < word1.length())
                res += word1[i];
            if(i < word2.length())
                res += word2[i];
        }
        return res;
    }
```