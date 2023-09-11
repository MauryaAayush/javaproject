import java.util.Scanner;

public class Circle {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is a area of circle");
        System.out.print("Enter the value of Radius (r) : ");
        short r = input.nextShort();
        float pi = 3.14f;

        float ans = pi * r * r;

        System.out.println("The area of circle is " + ans);

    }
}
