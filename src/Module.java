import java.util.Scanner;

public class Module
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        byte a = input.nextByte();

        System.out.print("Enter the value of b : ");
        byte b = input.nextByte();

        int c = a % b;

        System.out.println("Here is your Modules : "+c);

    }
}