import java.util.*;
public class IteratingList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> al =new  ArrayList<String>();
        al.add("black");
        al.add("red");
        al.add("yellow");
        al.add("blue");

        for(int i=0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("--------------");

        int i= 0;
        while(i<al.size())
        {
            System.out.println(al.get(i));
            i++;

        }
        System.out.println("---------------");

        for(String r : al)
        {
            System.out.println(r);
        }
        System.out.println("----------------");

        // Iterator loop

       Iterator<String> it = al.listIterator();
       while(it.hasNext())
       {
        System.out.println(it.next());
       }

    }
}
