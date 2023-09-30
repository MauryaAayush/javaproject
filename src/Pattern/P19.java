package Pattern;

public class P19 {
    public static void main(String[]args)
    {
        byte i,j,n=1;

        for(i=1; i <=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" "+ n++);
            }
            System.out.println();
        }
    }
}
