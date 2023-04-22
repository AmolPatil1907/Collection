import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class AddEle
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new  ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(40);

        int num = al.get(2);
        System.out.println("getMethod : " +num);

        System.out.println("add method :" + al);

        boolean isContains = al.contains(20);
        System.out.println("contains method : " + isContains);

        int index = al.indexOf(20);
        System.out.println("index of method : " + index);

        int index2 = al.lastIndexOf(40);
        System.out.println("last of index : " + index2);

        boolean isEmpty = al.isEmpty();
        System.out.println("isEmptyMethod : " + isEmpty);

        al.set(1, 200);
        System.out.println("set ele. at give index : " + al);

        int size = al.size();
        System.out.println("size method : " + size);

       // object[] a = al.toArray();
       // System.out.println(Arrays.toString(a));

        al.remove(2);
        System.out.println("remove method : " + al);

        al.clear();
        System.out.println("clear method : " + al);

    }
}