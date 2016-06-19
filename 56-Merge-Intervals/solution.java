/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
   public List<Interval> merge(List<Interval> intervals) 
	{
	   ArrayList<Interval> res=new ArrayList<Interval>();
          
          if(intervals.size()==0)
        	  return res;
          Comparator<Interval> c=new Comparator<Interval>()
		  {

			public int compare(Interval I1, Interval I2)
			{
				
				return I1.start-I2.start;
			}
		  };
          Collections.sort(intervals,c);
          int start=intervals.get(0).start;
          int end=intervals.get(0).end;
          for(int i=1;i<intervals.size();i++)
          { 
        	  Interval v=intervals.get(i);
    		  if(end>=v.start)
    		  {
    			  end=Math.max(end, v.end);
    		  }
    		  else
    		  {
    			  res.add(new Interval(start,end));
    			  start=v.start;
    			  end=v.end;
    		  }
          }
          res.add(new Interval(start,end));
          return res;
	}
}