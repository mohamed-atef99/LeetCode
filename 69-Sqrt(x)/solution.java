public class Solution 
{
    public int mySqrt(int a) 
    {
        int start=1;
	    int end =a;
	    while(start<=end)
	    {
	        int mid=(start+end)/2;
	        if(mid==a/mid)
    		{
    			return mid;
    		}
    		else if(mid>a/mid)
    		{
    			end=mid-1;
    		}
    		else
    		{
    			start=mid+1;
    		}
	    }
	    return end;
    }
}