public class Solution {
   public void rotate(int[] nums, int k) 
	{
	   if(nums!=null&&nums.length>1)
	   {
    	    k=k%nums.length;
    	    if(k>0)
    	    {
    	    	reverse(0,nums.length-1,nums);
    		    reverse(0,k-1,nums);
    		    reverse(k,nums.length-1,nums);
    		}
	   }	
	}

	public void reverse(int first,int last,int [] nums)
	{
	 
	 while(first<last)
	 {
	    int temp=nums[first];
		nums[first]=nums[last];
		nums[last]=temp;
		first++;
		last--;
	 }
	  
	}
}