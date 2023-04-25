import java.util.*;

import javax.swing.text.AbstractDocument;
public class SetBasic 
{
    public static void main(String[] args) 
    {
       //HasheSet.....
        int [] a = {1,22,16,40,50,60,19,4,19,8};

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<a.length; i++)
        {
            hs.add(a[i]);
        }

        System.out.println(hs);
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(22);
        hs2.add(16);
        hs2.add(50);
        hs2.clone();
        boolean r2 = hs.containsAll(hs2);
        System.out.println(hs2);
        boolean r = hs2.contains(1);
        System.out.println(r);
        System.out.println(r2);

        for(int data : hs)
        {
            if(hs2.contains(data))
            {
                System.out.println(data);
            }
        }


        // TreeSet...

        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(20);
        ts.add(30);
        ts.add(5);
        ts.add(20);
        ts.add(40);

        System.out.println(ts);

        ArrayList<Integer> al = new ArrayList<Integer>(ts);
        Collections.reverse(al);
        System.out.println(al);

    }

   
}
