package Pattern;

public class P20 {
    public static void main(String[]args)
    {
        byte i,j;

        for(i=1; i <=5; i++)
        {
            for(j=i; j>=1; j--)
            {
                String result = (j % 2 == 0) ? "|" : "-";
                System.out.print(" "+result);
            }
            System.out.println();
        }
    }
}
