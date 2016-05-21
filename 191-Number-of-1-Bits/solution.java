public class Solution 
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
        if(n==0)
          return 0;
        int sum=0;
        while(n!=0)
        {
            sum++;
            n=n&(n-1);
        }
        return sum;
    }
}