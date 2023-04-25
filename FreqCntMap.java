import java.util.HashMap;
import java.util.*;
public class FreqCntMap 
{
    public static void main(String[] args) 
    {
        
        String s = "abcdabcaabcda";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), ++value);
            }
            else
           {
            map.put(s.charAt(i), 1);
           }
        }
        System.out.println(map);

       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       char ch = 0;
       char ch2 = 0;
       for(char key : map.keySet())
       {
        if(map.get(key)>max)
        {
            max = map.get(key);
            ch = key;
        }
        if(map.get(key)<min)
        {
            min = map.get(key);
            ch2 = key;
        }
       }
       System.out.println(ch + " " + max + "\n" + ch2 + " " + min);

    }

}
