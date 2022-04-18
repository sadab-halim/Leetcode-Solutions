class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x==palincheck(x,0)||x==0)
            return true;
        else
            return false;
    }
    public static int palincheck(int n,int temp)
    {
        if(n==0)
            return temp;
        temp=temp*10 + n%10;
        return palincheck(n/10,temp);
    }
}