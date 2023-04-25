public class EqulilibriumPoint 
{
    public static void main(String[] args) {
        
        int [] a = {1,3,5,2,9};
       
       for(int i=0; i<a.length; i++)
       {
        int sum1 = 0;
            for(int j=0; j<i; j++)
            {
                sum1 += a[j];
            }
            int sum2 = 0;
            for(int k=i+1; k<a.length; k++)
            {
                sum2 += a[k];
            }
            if(sum1 == sum2)
            {
                System.out.println(i+1);
                break;
                
            }
       
       
    }
}
}