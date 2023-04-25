import java.util.ArrayList;

import java.util.*;
public class ListMethod 
{
    public static void main(String[] args) 
    {
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.add(20);
       al.add(50);
       al.add(60);
       al.add(7);
       al.add(90);
       al.add(1);
       al.add(50);

       System.out.println(al);
       
      int o =  al.get(4);
      System.out.println(o);

      int i1 =  al.indexOf(50);
      System.out.println(i1);

      int i2 = al.lastIndexOf(50);
      System.out.println(i2);

      ArrayList<Integer> al2 = new ArrayList<Integer>(al);
      System.out.println(al2);
      System.out.println(al.equals(al2));

      List<Integer> mysublist = al.subList(1,3);
      System.out.println(mysublist);

      for(int i=0; i<al.size(); i++)
     {
        System.out.print(al.get(i)  + " ");
     }
     System.out.println();

     boolean result = al.containsAll(al2);
     System.out.println( al.contains(7));
   
      boolean result2 = al.equals(al2);
     // ArrayList<Integer> al3 = new ArrayList<Integer>();
    
     boolean result3 = al2.isEmpty();
     al.set(3, 77);
      al.add(1);
    
      System.out.println(result);
      System.out.println(result2);
      System.out.println(al2);
      System.out.println(result3);
      System.out.println(al);        
      System.out.println(al);
      al.remove(6);
      System.out.println(al);
      al.replaceAll(null);
   }         
}
