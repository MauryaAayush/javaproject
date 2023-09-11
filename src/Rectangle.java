import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is a area of Rectangle");
        System.out.print("Enter the value of Length (l) : ");
        short l = input.nextShort();
        System.out.print("Enter the value of Breadth (b) : ");
        short b = input.nextShort();

        int ans = l * b;

        System.out.println("The area of Rectangle is " + ans);

    }
}
