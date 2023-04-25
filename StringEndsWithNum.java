public class StringEndsWithNum 
{
    public static void main(String[] args) 
    {
        String s1 = "geeks5";
        String s2 = "";

        for(int i=s1.length()-1; i>=0; i--)
        {
            if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
            {
                s2 = s1.charAt(i)+s2;
            }
            else
            break;
        }
        int num = Integer.parseInt(s2);
        int newLen = s1.length()-s2.length();
        if(newLen == num)
        System.out.println("1");
        else
        System.out.println("0");
       
    }
}
