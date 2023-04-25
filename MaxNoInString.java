import java.util.*;
public class MaxNoInString 
{
    public static void main(String[] args) 
    {
        LinkedList<String> ll = new LinkedList<>();
        String s1 = "ac140lt52lg666lf";
        long max = 0;
        
        for (int i = 0; i<s1.length(); i++) 
        {
            String s = "";
           for(int j =i; j<s1.length(); j++)
           {
            if(s1.charAt(j) >= '0' && s1.charAt(j)<='9')
            {
                s += s1.charAt(j);
            }
            else
            {
                ll.add(s);
                i=j;
                break;
            }
           } 
        }
        System.out.println(ll);
        for(int i=0; i<ll.size(); i++)
        {
            if(ll.get(i) == " ")
            {
                ll.remove(ll.get(i));
            }
        }
        System.out.println(ll);
        for (int i=0; i<ll.size(); i++) 
        {
            if(ll.get(i) != " ")
        {
                Integer num1 = Integer.parseInt(ll.get(i));
            if(max < num1)
            {
                max = num1;
            }
        }
            else
            {

            }

        }
        System.out.println(max);
    }    
}
