import java.util.Scanner;

public class Formula6 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a program of (x - y - z)^3");

        short x,y,z;

        System.out.print("Enter the value (X) : ");
        x = input.nextShort();
        System.out.print("Enter the value (Y) : ");
        y = input.nextShort();
        System.out.print("Enter the value (Z) : ");
        z = input.nextShort();

        int c = (x*x*x)-(3*x*x*y)+(3*x*y*y)-(y*y*y)-(3*x*x*z)+(6*x*y*z)-(3*y*y*z)+(3*x*z*z)+(3*y*z*z)-(z*z*z);

        System.out.println("Here is (x - y - z)^3 : " + c);


        //(x - y - z)^3 = x^3 - 3x^2y + 3xy^2 - y^3 - 3x^2z + 6xyz - 3y^2z + 3xz^2 + 3yz^2 - z^3

    }
}
