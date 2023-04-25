import java.util.*;
public class LastAppearancIndex 
{
    public static void main(String[] args) 
    {
        int [] a = {10,20,30,20,10,20,50};
        int minIndex = Integer.MAX_VALUE;
        int ele = 0;
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<a.length; i++)
        {
            al.add(a[i]);
        }

        for(int i=0; i<al.size(); i++)
        {
            int index = al.lastIndexOf(al.get(i));
            if(index<minIndex)
            {
                minIndex = index;
                ele = al.get(i);
            }
        }
        System.out.println(minIndex + " " + ele);

       

    }
}
