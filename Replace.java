import java.util.ArrayList;

public class Replace 
{
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("blck");
        al.add("green");
        al.add("red");
        al.add("gora");

        System.out.println(al);

        String ele = "white";
        String ele2 = "red";

        for(int i=0; i<al.size(); i++)
        {
            if(al.get(i).equals(ele2))
            {
                al.set(i, ele);
            }
        }
        System.out.println(al);

        String ele3 = "gora";
        String ele4 = "kaya";
        for(int i=0; i<al.size(); i++)
        {
            if(al.get(i).equals(ele3))
            {
                al.set(i, ele4);
            }
        }
        System.out.println(al);
        
    }
}
