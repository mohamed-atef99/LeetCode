public class Solution {
    	public  int findMin(int[] nums) 
    {
       if(nums==null)
           return 0;
         if(nums.length==0)
          return 0;

        int low=0;
        int high=nums.length-1;
        if(nums[low]<=nums[high])
          return nums[low];
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            int next=(mid+1)%nums.length;
            int prev=(mid-1+nums.length)%nums.length;
            if(nums[mid]<nums[next]&&nums[mid]<nums[prev])
              return nums[mid];
            if(nums[mid]>nums[high])
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        return mid;
    }
}