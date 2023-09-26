package Pattern;

public class P22 {
    public static void main(String[]args)
    {
        char i,j,n='A';

        for(i=1; i <=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" "+ n++);
            }
            System.out.println();
            System.out.println("Radhey Radhey");
        }
    }
}
