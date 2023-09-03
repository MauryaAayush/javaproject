import java.util.Scanner;

public class Swap4 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a swaping program");

        short a,b,c;

        System.out.print("Enter the value (A) : ");
        a = input.nextByte();
        System.out.print("Enter the value (B) : ");
        b = input.nextByte();

        c = a;
        a = (short) (a * b);
        b = (short) (c / b);

        System.out.println(" here is A  " + a);
        System.out.println(" here is B  " + b);

    }
}
