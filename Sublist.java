import java.util.ArrayList;
import java.util.List;
public class Sublist 
{
    public static void main(String[] args) {
     
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(20);

        int start = 2;
        int end = 5;

        List<Integer> mySubList = al.subList(start, end);
        System.out.println(mySubList);
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);

        boolean isEquals = al.equals(al2);
        System.out.println(isEquals);

        al.addAll(al2);
        System.out.println(al);

        ArrayList<Integer> al3 = new ArrayList<Integer>();
        System.out.println(al3);

    }
}
