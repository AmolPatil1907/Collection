import java.util.*;
public class CompaireTwoString 
{
    public static void main(String[] args) {
        
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";
        String s3 = "";
        String s4 = "";

        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) 
        {
            al.add(s1.charAt(i));   
        }
        for (int i = 0; i < s2.length(); i++) 
        {
            al2.add(s2.charAt(i));   
        }
        for (int i = 0; i < al.size(); i++)
        {
            if(al2.contains(al.get(i)))
            {

            }
            else
            {
                s3 = s3+al.get(i);
            }

        }
        for (int i = 0; i < al2.size(); i++)
        {
            if(al.contains(al2.get(i)))
            {

            }
            else
            {
                s3 = s3+al2.get(i);
            }

        }
       char [] ca = s3.toCharArray();
       Arrays.sort(ca);
       s3 = new String (ca);
       System.out.println(s3);

       // or

       TreeSet<Character> ts = new TreeSet<>();
       for (int i = 0; i < s1.length(); i++) 
       {
        if(!s2.contains(s1.charAt(i)+""))
        {
            ts.add(s1.charAt(i));
        }        
       }

       for (int i = 0; i < s2.length(); i++) {
        if(!s1.contains(s2.charAt(i)+""))
        {
            ts.add(s2.charAt(i));
        }        
       }
        
       System.out.println(ts);
       
      
       for(char data : ts)
       System.out.print(data);


    }    
}
