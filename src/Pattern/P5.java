package Pattern;

public class P5 {
    public static void main(String[]args)
    {
        byte i,j;

        for(i=5; i>=1; i--)
        {
            for(j=i; j<=5; j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
