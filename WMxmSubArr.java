public class WMxmSubArr 
{
    public static void main(String[] args) 
    {
       int [] a = {8,-8,9,-9,10,-11,12};
       int mainMax = 0;
       for (int l = 0; l < a.length; l++) {
         
       
       int max = 0;
       for (int i = 0; i < a.length; i++) {         
        
         for(int j = i; j<a.length; j++)
         {
            int sum = 0;
            for (int k = i; k <= j; k++) 
            {
               sum += a[k];
               System.out.print(a[k]+" " );               
            }
            System.out.println(" = " + sum);     
            if(max<sum)
         max = sum; 
         if(mainMax<max)
         mainMax = max;      
         }   
              
       }
       System.out.println("Max sum : "+max);
       int temp = a[a.length-1];
       for (int i = a.length-1; i >0; i--) 
       {
         a[i] = a[i-1];
       }
       a[0] = temp;
      }
      System.out.println("main max : " + mainMax);

    }
}
