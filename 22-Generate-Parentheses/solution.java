public class Solution {
     public  List<String> generateParenthesis(int n)
	    {
	        List<String> Parenthesis=new ArrayList<String>();
	        generateParenthesisHelper(Parenthesis,n,n,"");
	        return Parenthesis;
	    }
	    public  void generateParenthesisHelper(List<String>paran,int openparan,int closeparan,String currentparan)
	    {
	        if(openparan==0&&closeparan==0)
	        {
	            paran.add(currentparan);
	        }
	        else 
	        {
	            if(openparan>0)
	                  generateParenthesisHelper(paran,openparan-1,closeparan,currentparan+"(");
	            if(openparan<closeparan)
	                  generateParenthesisHelper(paran,openparan,closeparan-1,currentparan+")");
	        }
	    }
}