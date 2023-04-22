package FullSyllabus;


import java.util.*;

public class SumOfSubArr {
    public static void main(String[] args) {
      int givenSum = -10;
      int cnt = 0;    

    int [] a = {10,2,2,-20,10};

    for(int i=0; i<a.length; i++)
    {
        for(int j=i; j<a.length; j++)
        {
            int sum = 0;
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int k=i; k<=j; k++)
            {
                al.add(a[k]);
                sum+=a[k];
            }
            if(givenSum == sum)
            {
                System.out.println(al);
                cnt++;
            }
        }
    }
    System.out.println(cnt);
    
}
}