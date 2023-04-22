public class SpiralPattrn 
{
    public static void main(String[] args) {
        
        int n = 5;
        int [][] a = new int [n][n];
        int imin = 0;
        int imax = a.length-1;
        int jmin = 0;
        int jmax = a.length-1;

        int cnt = 1;

       while(jmin<=jmax)
       {
        for(int j=jmin; j<=jmax; j++)
        {
            a[imin][j] = cnt++;
        }
        imin++;

        for(int i=imin; i<=imax; i++)
        {
            a[i][jmax] = cnt++;
        }
        jmax--;
        for(int j=jmax; j>=jmin; j--)
        {
            a[imax][j] = cnt++;
        }
        imax--;
        for(int i = imax; i>= imin; i--)
        {
            a[i][jmin] = cnt++;
        }
        jmin++;
       }

        for(int i=0; i<a.length; i++)
        {
            for(int j = 0; j<a.length; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    
    }
}
