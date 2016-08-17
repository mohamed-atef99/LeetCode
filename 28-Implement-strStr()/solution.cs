public class Solution {
    public int StrStr(string haystack, string needle) {
        int minIndex = -1;
        char[] n = needle.ToCharArray();
        char[] h = haystack.ToCharArray();
        
        if( n.Length > h.Length)
         return minIndex;
         
        if(n.Length == h.Length && n.Length == 0)//"" both are empty string
         return 0;

        int j=0;
        for(int i =0 ; i<h.Length-n.Length; i++){
            if(j==0)
              minIndex = i;
              
            else if( j == n.Length)
                return minIndex;

            if( h[i] == n[j] )
                j++;
            else
            {
                i = i-j; // return i back by j for overlaping..
                j = 0;
            }
       }
       
       if(j == n.Length)
            return minIndex;
        else
            return -1;
    }
}