import java.util.Scanner;

public class Formula7 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a program of (x + y + z)^2");

        short x,y,z;

        System.out.print("Enter the value (X) : ");
        x = input.nextShort();
        System.out.print("Enter the value (Y) : ");
        y = input.nextShort();
        System.out.print("Enter the value (Z) : ");
        z = input.nextShort();

        int c = (x*x) + (2*x*y) + (2*x*z) + (y*y) + (2*y*z) + (z*z*z);
        System.out.println("Here is (x + y + z)^2 : " + c);


        //(x + y + z)^2 = x^2 + 2xy + 2xz + y^2 + 2yz + z^2

    }
}
