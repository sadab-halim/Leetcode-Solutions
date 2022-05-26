public int hammingWeight(int n) {
    int i,c=0;
    for(;n!=0;n=n>>>1)
    {
        c+=(n&1);
    }
    return c;
}