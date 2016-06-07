public class Solution {
  public  class NumberCount
	    {
	        public int num;
	        public int count;
	        public NumberCount(int Num)
	        {
	            this.num=Num;
	        }
	    }
	    public  class NumberCountComparator implements Comparator<NumberCount>
	    {
	        public int compare(NumberCount n1,NumberCount n2)
	        {
	            return n1.count-n2.count;
	        }
	    }
	    public  List<Integer> topKFrequent(int[] nums, int k) 
	    {
	      HashMap <Integer,NumberCount> hashlist=new HashMap<Integer,NumberCount>();
	      for(int num:nums)
	      {
	          NumberCount current=null;
	          if(hashlist.containsKey(num))
	          {
	            current=hashlist.get(num);
	            current.count++;
	          }
	          else
	          {
	              current=new NumberCount(num);
	              hashlist.put(num,current);
	          }
	      }
	      NumberCountComparator nccomparator=new NumberCountComparator();
	      PriorityQueue<NumberCount> pq = new PriorityQueue<NumberCount>(k,nccomparator);
	      Object[] list= hashlist.values().toArray();
	      int j=0;
	      while(j<k)
	      {
		         pq.add((NumberCount)list[j]);
                 j++;
	      }
	      for(int i=j;i<list.length;i++)
	      {
	    	  NumberCount current=(NumberCount)list[i];
	          if(pq.peek().count<current.count)
	          {
	              pq.poll();
	              pq.add(current);
	          }
	      }
	      List<Integer> result=new LinkedList<Integer>();
	      for(int i=0;i<k;i++)
	      {
	    	  result.add(pq.poll().num);
	      }
	      return result;
	    }
}