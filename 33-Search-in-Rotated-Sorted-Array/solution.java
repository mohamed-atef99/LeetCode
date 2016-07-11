public class Solution {
    public int search(int[] a, int b) 
    {
	    int start=0;
	    int end=a.length-1;
	    while(start<=end)
	    {
	        int mid=start+((end-start)/2);
	        int current=a[mid];
	        int startelem=a[start];
	        int endelem=a[end];
	        if(b==current)
	        {
	            return mid;
	        }
	        else if(startelem<=current)
	        {
	           if(b>=startelem&&b<current)
	           {
	        	   end=mid-1;
	           }
	           else
	           {
	        	   start=mid+1;
	           }
	        }
	        else
	        {
	            if(b>current&&b<=endelem)
	            {
	            	start=mid+1;
	            }
	            else
	            {
	            	end=mid-1;
	            }
	        }
	    }
	    return -1;
	}
}
