import java.util.HashMap;
import java.util.*;
public class HashMapMethod 
{
      public static void main(String[] args) 
    {
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(2, "hello");
        map.put(4, "hello");
        map.put(6, "hi");
        map.put(8, "jfd");
        map.put(12, "Namste");
        for(int r : map.keySet())
        System.out.print(r+ " ");
        System.out.println();
        for(String r : map.values())
        System.out.print(r+" ");
        System.out.println();
       System.out.println(map.values());
       System.out.println(map.keySet());
     
      Set<Integer> set = map.keySet();
      for(int r : set)
      System.out.println(r);
        
        TreeMap<Integer, String> tm = new TreeMap<Integer,String>(map);
        System.out.println(tm.ceilingKey(9));
        System.out.println(tm.ceilingEntry(9));
        System.out.println(tm.firstKey());
       
        System.out.println(map);
        Set s = map.entrySet();
        System.out.println(s);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("hi"));
        System.out.println(map.get(4));
        String s1 = "abcd";
        String s2 = "abcde";
        System.out.println(s1.startsWith(s2));
        System.out.println(map.get("hi"));
        //tm.floorEntry(null);
        System.out.println(tm.floorEntry(9));
        
    }
}
