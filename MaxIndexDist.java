public class MaxIndexDist 
{
    public static void main(String[] args) {
        
        int [] a = {3,2,1,2,1,4,5,8,6,7,4,2,2};

        int maxLen = 0;

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    if(maxLen<(j-i))
                    maxLen = j-i;                   
                }
            }
        }
        System.out.println(maxLen);
    }
}
