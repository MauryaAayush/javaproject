import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a swaping program");

        short a,b;

        System.out.print("Enter the value (A) : ");
        a = input.nextByte();
        System.out.print("Enter the value (B) : ");
        b = input.nextByte();

        a = (short) (a * b);
        b = (short) (a / b);
        a = (short) (a / b);

        System.out.println(" here is A  " + a);
        System.out.println(" here is B  " + b);

    }
}
