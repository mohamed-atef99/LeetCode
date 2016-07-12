public class Solution {
    
    public int strStr( String haystack,  String needle) 
	{
	     if(needle==null)
	        return 0;
	     if(needle.length()==0)
	        return 0;

           
	    for(int i=0;i<=haystack.length()-needle.length();i++)
	    {
	        if(ismatch(haystack,needle,i))
	        {
	            return i;
	        }
	    }
	    return -1;
	}
	public boolean ismatch(String haystack,String needle,int s)
	{
	    for(int i=0;i<needle.length();i++)
	    {
	        if(needle.charAt(i)==haystack.charAt(s))
	        {
	            s++;
	        }
	        else
	         return false;
	    }
	    return true;
	}
}