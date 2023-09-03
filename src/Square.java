import java.util.Scanner;

public class Square {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is a area of square");
        System.out.print("Enter the value of side (s) : ");
        short s = input.nextShort();


        int ans = s * s;

        System.out.println("The area of square is " + ans);

    }
}
