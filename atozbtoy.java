public class atozbtoy 
{
    public static void main(String[] args) 
    {
        String s = "varun";
        String s1 = "";

        for(int i=0; i<s.length(); i++)
        {
            char ch = (char)(219 - s.charAt(i));
            s1 = s1 + ch;
        }

        System.out.println(s1);
    }
}























