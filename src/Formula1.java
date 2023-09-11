import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a program of (a+b"^2);


        System.out.print("Enter the value (A) : ");
        short a= input.nextShort();
        System.out.print("Enter the value (B) : ");
        short b = input.nextShort();

        int c = (a * a) + (2*a*b) + (b * b);

        System.out.println("Here is (a + b)^2 : " + c);


    }
}
