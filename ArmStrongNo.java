public class ArmStrongNo 
{
    public static void main(String[] args) 
    {
        int num = 153;
        int sum = 0;
        int originalNum = num;

        while(num>0)
        {
            int rem = num%10;
            sum += rem*rem*rem;
            num/=10;
        }
        if(sum == originalNum)
        System.out.println("Number is Armstrong number");
        else
        System.out.println("Number is not Armstrong number");
    }
}

