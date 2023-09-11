import java.util.Scanner;

public class Ladder {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a;

        System.out.print("Enter the value of a : ");
        a = input.nextShort();

        if(a > 0)
        {
            System.out.println("This is a positive number");
        }
        else if(a < 0)
        {
            System.out.println("This is a negative number");
        }
        else
        {
            System.out.println("This is a neutral");
        }
    }
}
