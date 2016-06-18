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
    public  List<Interval> insert(List<Interval> intervals, Interval newInterval) 
	{
		ArrayList<Interval> res=new ArrayList<Interval>();
		if(intervals.size()==0)
		{
			res.add(newInterval);
			return res;
		}
		int start=0;
		int i=0;
		boolean isstart=true;
		for( i=0;i<intervals.size();i++)
		{
			Interval current=intervals.get(i);
			if(isstart)
			{
				if(newInterval.end<current.start)
				{
					res.add(newInterval);
					res.add(current);
					isstart=true;
					break;
				}
				else if(newInterval.start<current.start&&newInterval.end<=current.end)
				{
					res.add(new Interval(newInterval.start,current.end));
					break;
				}
				else if(newInterval.start<current.start&&newInterval.end>current.end)
				{
					start=newInterval.start;
					isstart=false;
				}
				else if(newInterval.start>current.end)
				{
					res.add(current);
					if(i==intervals.size()-1)
					{
						res.add(newInterval);
						isstart=true;
					}
				}
				else if(newInterval.start>=current.start&&newInterval.end>current.end)
				{
					start=current.start;
					isstart=false;
				}
				
				else if(newInterval.start>=current.start&&newInterval.end<=current.end)
				{
					res.add(current);
					isstart=true;
					break;
				}
				else if(newInterval.start==current.end)
				{
					start=current.start;
					isstart=false;
				}
			}
			else
			{
				if(newInterval.end<current.start)
				{
					res.add(new Interval(start,newInterval.end));
					res.add(current);

					isstart=true;
					break;
				}
				else if(newInterval.end==current.start)
				{
				 	res.add(new Interval(start,current.end));
					isstart=true;
					break;
				}
				else if(newInterval.end<=current.end)
				{
					res.add(new Interval(start,current.end));
					isstart=true;
					break;
				}
			}
		}
		for(int j=i+1;j<intervals.size();j++)
		{
			res.add(intervals.get(j));
		}
		if(!isstart)
		{
			res.add(new Interval(start,newInterval.end));
		}
		return res;

    }
}