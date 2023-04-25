public class ContainsNoCnt 
{
    public static void main(String[] args) 
    {
        
        int  n = 500;
        int cnt = 0;
        for(int i=0; i<=n; i++)
        {
           int num = i;
           while(num>0)
           {
            int digit = num%10;
            if(digit == 4)
            {
                cnt++;
                break;
            }
            num/=10;
           }
        }
        System.out.println(cnt);

    }
}

