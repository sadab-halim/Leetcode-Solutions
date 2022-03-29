public boolean checkInclusion(String s1, String s2){
    if(s1.length() > s2.length())
        return false;
    
    int[] c1 = new int[26];
    for(char c:s1.toCharArray())
        c1[c - 'a']++;
    
    int[] c2 = new int[26];
    for(int i = 0; i < s1.length(); i++)
        c2[s2.charAt(i) - 'a']++;
    
    if(checkSign(c1, c2))
        return true;
    
    int start = 0;
    for(int end = s1.length(); end < s2.length; end++){
        c2[s2.charAt(start) - 'a']--;
        start++;
        c2[s2.charAt(end) - 'a']++;
        if(checkSign(c1, c2))
            return true;
    }
    return false;

    private boolean checkSign(int[] c1, int[] c2){
        for(int i = 0; i < 26; i++)
            if(c1[i] != c2[i])
                return false;
    }
}