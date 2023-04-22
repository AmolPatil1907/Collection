public class PerfectSQ 
{
    public static void main(String[] args) {
        
        int n = 56;
        int sum = 0;
        int cnt = 0;
        for(int i=1; i<=n; i+=2)
        {
           
            sum+=i;
            if(sum == n)
            {
                cnt++;
                System.out.println("true");
                break;
            }
            
        }
        if(cnt == 0)
        System.out.println("false");
    }
}
