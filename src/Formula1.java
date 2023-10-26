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

       a = (short) (a +b);
       b = (short) (a - b);
       a = (short) (a - b);

        System.out.println(a);
        System.out.println(b);


    }
}
