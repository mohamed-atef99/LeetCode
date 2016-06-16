public class Solution {
   public  List<Integer> spiralOrder(int [][] matrix)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix.length==0)
		 return result;
		int rowbegin=0;
		int rowend=matrix.length-1;
		int colbegin=0;
		int colend=matrix[0].length-1;
		int dir=0;
		while(rowbegin<=rowend&&colbegin<=colend)
		{
			switch(dir)
			{
			  case 0:
				  for(int k=colbegin;k<=colend;k++)
				  {
					  result.add(matrix[rowbegin][k]); 
				  }
				  dir=1;
				  rowbegin++;
			  break;
			  case 1:
				  for(int k=rowbegin;k<=rowend;k++)
				  {
					  result.add(matrix[k][colend]);
				  }
				  dir=2;
				  colend--;
			  break;
			  case 2:
				 for(int k=colend;k>=colbegin;k--)
				 {
					 result.add(matrix[rowend][k]);
				 }
				 dir=3;
				 rowend--;
			  break;
			  case 3:
				  for(int k=rowend;k>=rowbegin;k--)
				  {
					  result.add(matrix[k][colbegin]);
				  }
				  dir=0;
				  colbegin++;
			  break;
			}
		}
        return result;
	}
}