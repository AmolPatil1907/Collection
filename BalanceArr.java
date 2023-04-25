public class BalanceArr 
{
    public static void main(String[] args) {
        int [] a = {1,5,3,2};
        int min = Integer.MAX_VALUE;
        int mid = a.length/2;
        int leftSum = 0;

        for(int i=0; i<mid; i++)
        {
           leftSum += a[i]; 
        }

        int rightSum = 0;
        for(int i=mid; i<a.length; i++)
        {
            rightSum += a[i];
        }
        System.out.println(Math.abs(rightSum-leftSum));
        System.out.println(Math.abs(-99-1));
    }
}
