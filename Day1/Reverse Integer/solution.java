class Solution {
    public int reverse(int x) {
        long rev=0;
        int rem;
        while(x!=0){
            
        rem =x%10;
        rev=(rev*10)+rem;
        x=x/10;
        }
       
        if( rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
    {
        return 0;
    }
    if(x<0){
        return (int)(-1*rev);
    }
       return (int)rev;
    }
}