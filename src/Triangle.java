import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is a area of Triangle");
        System.out.print("Enter the value of Length (l) : ");
        short l = input.nextShort();
        System.out.print("Enter the value of height (h) : ");
        short h = input.nextShort();
        float c = 0.5f;

        float ans = c * l * h;

        System.out.println("The area of Triangle is " + ans);

    }
}
