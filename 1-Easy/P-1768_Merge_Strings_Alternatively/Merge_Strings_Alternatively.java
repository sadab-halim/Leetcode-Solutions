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