public class Solution {
    public int coinChange(int[] bills, int amount)
    {
        if(bills==null)
          return -1;
         if(amount==0)
           return 0;
           
    	int [] MinCache=new int[amount];
    	
    	for(int i=1;i<=amount;i++)
    	{
    		int min=Integer.MAX_VALUE;
    		
    		for(int bill:bills)
    		{
    		    int remaining=i-bill;
    			if(remaining>0&&MinCache[remaining-1]>0)
    			  min=Math.min(MinCache[remaining-1]+1, min);
    			else if(i-bill==0)
    				min=1;
    		}
    		MinCache[i-1]=min==Integer.MAX_VALUE?-1:min;
    	}
    	
    	return MinCache[amount-1];
    
    }
}