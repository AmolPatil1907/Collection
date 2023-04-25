public class StrongNumber 
{
    public static void main(String[] args) 
    {
        int n = 145;
        int sum = 0;
        int originalNum = n;
     

        while(n>0)
        {
            int rem = n%10;
            int fact = 1;
            for(int i=1; i<=rem; i++)
            {
                fact = fact*i;
                
            }
            sum = sum + fact;
            n/=10;

        }
        if(sum == originalNum)
        {
            System.out.println("Number is strong");
        }
        else
        System.out.println("number is not strong");
    }
}
