import java.util.ArrayList;

public class SubArrSum {
    public static void main(String[] args) {
        
        int []a = {1,4,45,6,0,9};
       
        int x = 51;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> al2 = null;

        for(int i=0; i<a.length; i++)
        {
            for(int j=i; j<a.length; j++)
            {
                ArrayList<Integer> al = new ArrayList<>();
                int sum = 0;
                for(int k=i; k<=j; k++)
                {
                   al.add(a[k]);
                 //  System.out.println(al);
                   sum+=a[k];
                }
                if(sum>x)
                {
                    if(al.size()<min)
                    min = al.size();
                    al2 = al;
                }
                
            }
            
        }
        System.out.println(min + "  " + al2);
    }
    
}
