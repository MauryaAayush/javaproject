package Pattern;

public class P17 {
    public static void main(String[] args)
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" "+j%2);
            }
            System.out.println();
        }
    }
}
