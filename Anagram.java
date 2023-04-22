import java.util.*;
public class Anagram 
{
    public static void main(String[] args) 
    {
        String s1 = "geeksforgeeks";
        String s2 = "geeksforgeesk";

        TreeMap<Character, Integer> tm1 = new TreeMap<Character, Integer>();
        findFreq(s1,tm1);
       
      
        TreeMap<Character,Integer> tm2 = new TreeMap<Character,Integer>();
        findFreq(s2,tm2);

        if(tm1.equals(tm2))
        System.out.println("anagram");
        else
        System.out.println("not anagram");

    }

    private static void findFreq(String s1 , TreeMap<Character,Integer>tm1)
    {
        for(int i=0; i<s1.length(); i++)
        {
            if(tm1.containsKey(s1.charAt(i)))
            {
                int value = tm1.get(s1.charAt(i));
                value++;
                tm1.put(s1.charAt(i), value);
            }
            else
            tm1.put(s1.charAt(i), 1);
        }
        //System.out.println(tm1);
        
    }
}
