import java.util.Scanner;

public class Pcircle {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is a Perimeter of circle");
        System.out.print("Enter the value of Radius (r) : ");
        short r = input.nextShort();
        float pi = 3.14f;

        float ans = 2 * pi * r;

        System.out.println("The Perimeter of circle is " + ans);
    }
}
