public class SameDupl 
{
    public static void main(String[] args) {
        int []a = {1,2,3,9,4,4,4,4,5,6};

        for(int i=0; i<a.length; i++)
        {
            if(a[i] == a[i+1])
           {
             System.out.println(a[i]);
             break;
           }
           else
           i+=2;
        }
    }
}
