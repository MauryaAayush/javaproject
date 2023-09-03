import java.util.Scanner;

public class SI {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is a Simple interest");
        System.out.print("Enter the value of Principle (p) : ");
        short p = input.nextShort();
        System.out.print("Enter the value of Rate (r) : ");
        short r = input.nextShort();
        System.out.print("Enter the value of Time (t) : ");
        short t = input.nextShort();


        float ans = (float)(p * r * t)/100;

        System.out.println("Here is your simple interest  " + ans);

    }
}
