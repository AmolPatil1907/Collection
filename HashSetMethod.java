import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class HashSetMethod 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(70);
        hs.add(40);
        hs.add(10);
        hs.add(40);
        
        
       // System.out.println(hs);
        Object [] arr = hs.toArray();
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
        HashSet<Integer> hs2 = new HashSet<Integer>(hs);       
       LinkedHashSet<Integer> lhs = new LinkedHashSet<>(hs);
        TreeSet<Integer> ts = new TreeSet<Integer>(hs);
        System.out.println(hs2);
        System.out.println(lhs);
        System.out.println(ts);
        Object arrr[] = ts.toArray();
        for(int i=0; i<arrr.length; i++)
        System.out.print(arrr[i]+" ");
        
        
    }
}
