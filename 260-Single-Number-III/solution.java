public class Solution 
{
    
	public int FindUnique(List<Integer> list)
    {
        int Unique=list.get(0);
        for(int i=1;i<list.size();i++)
          Unique^=list.get(i);
        
        
        return Unique;
    }
    public int[] singleNumber(int[] nums) 
    {
        int missingxornumbers=nums[0];
        for(int i=1;i<nums.length;i++)
          missingxornumbers^=nums[i];
        int differentbit=0;
        while(missingxornumbers!=0&&(missingxornumbers&1)==0)
        {
           missingxornumbers=missingxornumbers>>1;
           differentbit++;
        }
        List<Integer> group1=new ArrayList<Integer>();
        List<Integer> group2=new ArrayList<Integer>();
        int mask=1<<differentbit;
        for(int num:nums)
        {
            if((num&mask)>0)
              group1.add(num);
            else
              group2.add(num);
        }
        int [] missingnums=new int[2];
        missingnums[0]=FindUnique(group1);
        missingnums[1]=FindUnique(group2);
        
        return missingnums;
    }
}