public class Solution {
    public int numTrees(int n) 
    {
        int [] cache=new int [n+1];
        
       
        cache[0]=1;
        cache[1]=1;
        int j=2;
        while(j<=n)
        {
            int count=0;
            for(int k=0;k<j;k++)
            {
               count+=cache[k]*cache[j-k-1];
            }
            cache[j]=count;
            j++;
        }
        return cache[n];
    }
}