import java.util.*;
public class VatanMhanunKar 
{
    public static void main(String[] args) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        char ch = 0;
        
        String s = "abcfaadcbcdfe";
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i),++value);
            }
            else
            map.put(s.charAt(i),1);
        }
        System.out.println(map);
        for(int i=0; i<map.size(); i++)
        {            
            if(map.get(s.charAt(i)) > max )
            max = map.get(s.charAt(i));
            ch = s.charAt(i);
        }
        System.out.println(max+" " + ch);
    }
}
