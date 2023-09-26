package Pattern;

public class P16 {
    public static void main(String[]args)
    {
        byte i,j;

        for(i=5; i>=1; i--)
        {
            for(j=i; j>=1; j--)
            {
                System.out.print(" "+j%2);
            }
            System.out.println();
        }
    }
}
