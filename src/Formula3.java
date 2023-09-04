import java.util.Scanner;

public class Formula3 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a program of (a+b)^3");

        short a,b;

        System.out.print("Enter the value (A) : ");
        a =input.nextShort();
        System.out.print("Enter the value (B) : ");
        b = input.nextShort();

        int c = (a * a * a) + (3 * a * a * b) + (3 * a * b * b) + (b * b * b);

        System.out.println("Here is (a + b)^3 : " + c);


    }
}
