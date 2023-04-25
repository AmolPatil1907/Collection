public class RemoveChara 
{
    public static void main(String[] args) {
        
        String s1 = "computer";
        String s2 = "cat";
        String s3 = "";

        for(int i=0;i<s1.length(); i++)
        {
            int cnt = 0;
            for(int j=0; j<s2.length(); j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                cnt++;
            }
            if(cnt ==0)
            s3+=s1.charAt(i);
        }
        System.out.println(s3);
    
    
       
    }
}
