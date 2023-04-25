import java.util.*;
public class PrimeFactor 
{
    public static void main(String[] args) 
    {
        int n = 250;
        ArrayList<Integer> al = new ArrayList<Integer>();

        while(n>1)
        {
            int i=2; 
            while(i<=n)
            {
                if(n%i == 0)
                {
                    al.add(i);
                    n=n/i;
                    break;
                }
                i++;
            }
        }
        System.out.println(al);
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<al.size(); i++)
        {
            if(hm.containsKey(al))
            {
                int value = hm.get(i);
                //value++;
                hm.put(al.get(i), ++value);
            }
            else
            hm.put(al.get(i), 1);
        }
        System.out.println(hm);

    
    }
}
