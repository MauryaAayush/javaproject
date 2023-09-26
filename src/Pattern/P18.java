package Pattern;

public class P18 {
    public static void main(String[] args)
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                String result = (j % 2 == 0) ? "1" : "0";
                System.out.print(" "+result);
            }
            System.out.println();
        }
    }
}
