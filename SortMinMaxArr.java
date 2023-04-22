import java.util.Arrays;

public class SortMinMaxArr 
{
    public static void main(String[] args) 
    {
        int [] a = {1,3,2,5,4,6,9,8,7};

        int [] b = new int [a.length];

       Arrays.sort(a);

        int i=0;
        int j = a.length-1;
        int index = 0;
        while(i<j)
        {
            b[index++] = a[i];
            b[index++] = a[j];
            i++;
            j--;
        }

        if(i==j)
        b[index] = a[i];

        for(int k=0; k<b.length; k++)
        System.out.print(b[k] + " ");
    
    }
}
