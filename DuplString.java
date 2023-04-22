public class DuplString 
{
    
public static void main(String[] args) 
{
    String s = "Big black bug bit a big black dog on his big black nose";

    String [] sa = s.split(" ");

    for(int i=0; i<sa.length; i++)
    {
        int cnt = 0;
        for(int j=i+1; j<sa.length; j++)
        {
            if(sa[i].equals(sa[j]))
            {
                cnt++;
            }
        }
        if(cnt>0 && cnt<2)                     // cnt == 1;
        {
            System.out.println(sa[i]);
        }
    }
}
}
