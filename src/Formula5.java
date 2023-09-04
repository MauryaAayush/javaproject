import java.util.Scanner;

public class Formula5 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a program of ((a + b + c)^3");

        short x,y,z;

        System.out.print("Enter the value (X) : ");
        x = input.nextShort();
        System.out.print("Enter the value (Y) : ");
        y = input.nextShort();
        System.out.print("Enter the value (Z) : ");
        z = input.nextShort();

        int c = (x*x*x) + (3*x*x*y) + (3*x*y*y) + (y*y*y);

        System.out.println("Here is (a + b + c)^3 : " + c);


        //(a + b + c)^3 = a^3 + 3a^2b + 3ab^2 + b^3 + 3a^2c + 6abc + 3b^2c + 3ac^2 + 3bc^2 + c^3

    }
}
