public class AutomorphicNo 
{
    public static void main(String[] args) 
    {
        int num = 5;
        int sq = num*num;

        String numStr = Integer.toString(num);
        String sqStr = Integer.toString(sq);

        System.out.println(sqStr.endsWith(numStr));
    }
}
