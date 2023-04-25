//import java.util.TreeSet;
import java.util.*;

public class TreeSetMethod 
{
    public static void main(String[] args)     
    {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(90);
        ts.add(30);
        ts.add(80);
        ts.add(50);
        ts.add(10);

        

        Iterator<Integer> it = ts.descendingIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        ArrayList<Integer> al = new ArrayList<Integer>(ts);
        al.add(10);
       Collections.reverse(al);
       System.out.println(al);
        
    }
}
