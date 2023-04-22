public class SumDistinctArr 
{
    public static void main(String[] args) {
        
        int [] a = {2,2,3,5,8,2};

        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    ++a[j];
                }
            }
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
