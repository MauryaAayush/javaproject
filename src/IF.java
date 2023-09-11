import java.util.Scanner;

public class IF {
    public static void main(String[] args)
    {

        // find the min number
        Scanner input = new Scanner(System.in);

        byte a,b;

        System.out.print("Enter the value of a : ");
        a = input.nextByte();

        System.out.print("Enter the value of b : ");
        b = input.nextByte();

        if(a < b)
        {
            System.out.println("A is a minimum");
        }
        else
        {
            System.out.println("B is a minimum");
        }
    }
}
