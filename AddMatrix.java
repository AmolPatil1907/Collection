public class AddMatrix 
{
    public static void main(String[] args) 
    {
        int [][]a = {
            {
                1,4,5,3
            },
            {
                2,5
            },
            {
                9
            },
            {
                7,8,9,2,4,0,2
            }
        };
        int sum = 0;
        int k= 0; 
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[k].length; j++)
            {
                sum += a[i][j];
            }
            k++;
        }
        System.out.println(sum);
       
    }
}
