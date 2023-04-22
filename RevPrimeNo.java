public class RevPrimeNo 
{
    public static void main(String[] args) 
    {
        int n = 30;
        if(numberIsPrime(n))
        {

            int revNo = 0;
            while(n>0)
            {
                
                int rem = n%10;
                revNo = revNo*10 + rem;
                n/=10;
            }
            if(revNoIsPrime(revNo))
            {
                System.out.println("Twisted Prime Number");                
            }
            else
            System.out.println("not twisted prime no");
           
        }
        else
        System.out.println("not rwisted prime no");
    }

    private static boolean revNoIsPrime(int revNo) 
    {
        int cnt = 0;
        for(int i=2; i<revNo; i++)
        {
            if(revNo%i==0)
            return false;
        }       
        return true;
       
    }

    private static boolean numberIsPrime(int n) 
    {
        int cnt = 0;
        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
            return false;
        }        
        return true;    
        
    }
}
