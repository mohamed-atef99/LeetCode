public class Solution {
    public  HashMap<Integer, Integer> counthash=new HashMap<Integer, Integer>();
	 public  int climbStairs(int n) 
	 {
	     if(n==0)
	       return 1;
	     if(n<0)
	       return -1;
	     if(counthash.containsKey(n))
	    	 return counthash.get(n);
	     
	    int count1= climbStairs(n-1);
		int count2=	climbStairs(n-2);
        
		int result=0;
	    if(count1>0&&count2>0)
			result= count1+count2;
		else if (count2>0)
		  result= count2;
		else if(count1>0)
		  result= count1;
	    
	    counthash.put(n, result);
	    
		return result;
	 }
}