public class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {     
        
        if(nums!=null&&nums.length!=0)
        {
            int [] output=new int[nums.length];
            output[0]=1;
            for(int i=1;i<nums.length;i++)
            {
              output[i]=nums[i-1]*output[i-1];
            }
            int productsofar=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--)
            {
                output[i]*=productsofar;
                productsofar*=nums[i];
            }
            return output;
        }
        else
        {
            return new int[0];
        }
    }
}