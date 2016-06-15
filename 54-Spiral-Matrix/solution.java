public class Solution {
   public List<Integer> spiralOrder(int[][] matrix) {
		 
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 if(matrix.length!=0){
		 int numofelements=matrix.length*matrix[0].length;
		 int count=0;
		 int [] i={0,1,0,-1};
		 int [] j={1,0,-1,0};
		 int si=0;
		 int sj=0;
		 int colcount=matrix[0].length;
		 int rowcount=matrix.length;
		 int currentsize=colcount;
		 boolean rowdir=false;
		 while(count<numofelements)
		 {
			 for(int k=0;k<i.length;k++)
			 {
				if(currentsize==1)
				{
					result.add(matrix[si][sj]);
					count++;
				}
				else
				{
					for(int m=0;m<currentsize-1;m++)
					{
						result.add(matrix[si+i[k]*m][sj+j[k]*m]);
						count++;
					}
				}
				if(count<numofelements)
				{
					if(!rowdir)
					{
						sj=sj+(j[k]*(currentsize-1));
	                     if(sj==si)
	                    	 si++;
						currentsize=rowcount;
					}
					else
					{
						si=si+(i[k]*(currentsize-1));
	
						currentsize=colcount;
					}
					rowdir=!rowdir;
				}
				else
				{
					break;
				}
			 }
			 si=si+1;
			 sj=sj+1;
			 colcount=colcount-2;
			 rowcount=rowcount-2;
			 currentsize=colcount;	
		 }}
		 return result;
	}
}