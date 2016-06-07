public class Solution {
    public int maxProfit(int[] prices) 
    {
        if(prices==null||prices.length<=0)
	    {
	            return 0;
	    }
        int min=prices[0];
        int totalmax=0;
        int currentmax=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[i-1])
            {
                min=prices[i];
                totalmax+=currentmax;
                currentmax=0;
            }
            
            if(prices[i]>min)
            {
               currentmax=Math.max(currentmax,prices[i]-min);
            }
            else if(prices[i]<min)
            {
                min=prices[i];
            }
        }
        totalmax+=currentmax;
        return totalmax;
    }
}