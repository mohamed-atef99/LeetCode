public class Solution {
public String reverseString(String s)
	    {
		 if(s==null)
			 return null;
	        StringBuilder reversed=new StringBuilder();
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            reversed.append(s.charAt(i));
	        }
	        return reversed.toString();
	    }
}