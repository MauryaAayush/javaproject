import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a program of (a+b"^2);

        short a,b;

        System.out.print("Enter the value (A) : ");
        a = input.nextByte();
        System.out.print("Enter the value (B) : ");
        b = input.nextByte();

        int c = (a * a) + (2*a*b) + (b * b);

        System.out.println(" here is (a + b)^2  " + c);


    }
}
