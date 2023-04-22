public class GivenNumWirhSum 
{
   public static void main(String[] args) 
   {
    
    int n = 43;
    int orgNum = n;
    boolean flag = false;

    for(int i=1; i<n; i++)
    {
        int num = i;
        int sum = 0;
        while(num>0)
        {
            int rem = num%10;
            sum = sum + rem;
            num/=10;     
        }
        if(sum + i ==orgNum)
        {
        System.out.println(sum+ " " +  i);        
        flag = true;
        break;
        }        
    }
    if(flag == false)
    System.out.println("-1");   
   } 
}
