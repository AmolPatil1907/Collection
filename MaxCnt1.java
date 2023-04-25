public class MaxCnt1 
{
    public static void main(String[] args) 
    {
        
        String s = "11100011110222222220111111";

       String [] sa = s.split("0");
       //System.out.println(parseInt(sa[0]));
       int max= 0;
       String s2 = "";
      for(int i=0; i<sa.length; i++)
      {
        
            if(sa[i].length()>max)
            max = sa[i].length();
            s2 = sa[i];
        
      }
      System.out.println( s2 + " "+max);
    }
}
