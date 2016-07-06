public class Solution {
    
    public int[] searchRange(int[] a, int b) 
	{
	    int elemindex=BinarySearch(a,b,0,a.length-1);
	    int []  res=new int[2];
	    res[0]=-1;
	    res[1]=-1;
	    if(elemindex==-1)
	    {
	        return res;
	    }
	    int start=-1;
	    int end=-1;
	    if((elemindex-1>=0&&a[elemindex-1]!=b)||elemindex-1<0)
	    {
	        start=elemindex;
	    }
	    else
	    {
	        start=searchRangeHelper(a,b,true,0,elemindex-1);
	    }
	   
	    if((elemindex+1<a.length&&a[elemindex+1]!=b)||elemindex+1>=a.length)
	    {
	        end=elemindex;
	    }
	    else
	    {
	        end=searchRangeHelper(a,b,false,elemindex+1,a.length-1);
	    }
	    res[0]=start;
	    res[1]=end;
	    return res;
	}
	public static int searchRangeHelper(int [] a,int b ,boolean isbegin,int start,int end)
	{
	     int elemindex=BinarySearch(a,b,start,end);
	     if(isbegin)
	     {
	          if((elemindex-1>=0&&a[elemindex-1]!=b)||elemindex-1<0)
	          {
	             return elemindex;
	          }
	          else
	          {
	            return searchRangeHelper(a,b,true,start,elemindex-1);
	          }
	     }
	     else
	     {
	         if((elemindex+1<a.length&&a[elemindex+1]!=b)||elemindex+1>=a.length)
	         {
	            return elemindex;
	         }
    	     else
    	     {
    	        return searchRangeHelper(a,b,false,elemindex+1,end);
    	     }
	     }
	}
    
	public static int BinarySearch(int [] a,int b,int start,int end)
	{
	    while(start<=end)
	    {
	        int mid=start+((end-start)/2);
	        int CurrentElem=a[mid];
	        if(CurrentElem==b)
	        {
	           return mid; 
	        }
	        else if(b>CurrentElem)
	        {
	            start=mid+1;
	        }
	        else
	        {
	            end=mid-1;
	        }
	    }
	    return -1;
	}
}