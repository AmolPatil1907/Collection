import java.util.ArrayList;

import java.util.*;
public class CopyAL 
{
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("black");
        al.add("green");
        al.add("red");

        ArrayList<String> al2 = new ArrayList<String>(al);

        al2.addAll(al);

        
        for(String data : al)
        {
            al2.add(data);
        }
        System.out.println(al2);
    }
}
