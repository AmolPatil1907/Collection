public class Contain3And4 
{
    public static void main(String[] args) 
    {
        int n = 2;
        
        int a = 3,b=4;
        int i=1,cnt = 0;
        while(true)
        {
            int num = i;
            while(num>0)
            {
                int digit = num%10;
                if(digit ==a || digit == b)
                {
                    num/=10;
                }
                else
                break;
            }
            if(num == 0)
            {
                cnt++;
                System.out.println(i);
            }
            if(n==cnt)
            break;
            i++;
        }
        
       
    }
   
}
