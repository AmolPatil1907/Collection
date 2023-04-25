public class MunChhausenNo {
    public static void main(String[] args) {
        
        int num = 3435;
        int originalNum = num;
        int sum = 0;

        while(num>0)
        {
            int rem = num%10;
            sum = sum + (int)Math.pow(rem,rem);
            num/=10;

        }
        if(sum == originalNum)
        System.out.println("Munchhausen No");
        else
        System.out.println("Not Munchhausen No");
        for(int i=1; i<=5000; i++)
        {
            int sum2 = 0;
            int temp = i;
            while(temp>0)
            {
                int rem = temp%10;
                sum2 = sum2 + (int)Math.pow(rem,rem);
                num/=10;

            }
            if(sum2 == i)
            System.out.println(i);
        }
    }
    
}
