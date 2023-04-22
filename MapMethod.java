import java.util.HashMap;

import java.util.*;
public class MapMethod 
{
    public static void main(String[] args) 
    {
        
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1, "hello");
        hm.put(2, "hi");
        hm.put(3, "java");
        hm.put(4, "namste");
        
        System.out.println(hm);
        System.out.println(hm.size());
        

        HashMap<Integer,String> hm2 = new HashMap<Integer,String>(hm);
        System.out.println(hm2);
        hm.clear();
        System.out.println(hm);
        boolean r = hm.isEmpty();
        System.out.println(r);
		System.out.println(hm2.containsKey(2));
		System.out.println(hm2.containsValue("hi"));
        System.out.println(hm2.get(4));
        System.out.println(hm2.values());
        System.out.println(hm2.get(1));
        System.out.println(hm2.keySet());
        
    
        HashMap<Integer,String> hm3 = new HashMap<Integer,String>();
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(hm3);
       // tm.floorEntry(null)
        hm3.put(3, "javaa");
        System.out.println(hm3);
       System.out.println(hm3.get(50));         

    }
}
