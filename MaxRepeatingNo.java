import java.util.Arrays;

public class MaxRepeatingNo 
{
    public static void main(String[] args) {
        
        int [] a = {2,2,1,2};
        int k = 3,n=4;

        int maxCnt = 0;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++)
        {
            int cnt = 0;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    cnt++;
                }
                else
                i = j;
            }
           if(maxCnt<cnt)
           maxCnt = cnt;

        }
        System.out.println(maxCnt);
    }
}
