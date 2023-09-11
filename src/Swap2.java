import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a swaping program");

        byte a,b;

        System.out.print("Enter the value (A) : ");
        a = input.nextByte();
        System.out.print("Enter the value (B) : ");
        b = input.nextByte();

        a = (byte) (a + b);
        b = (byte) (a - b);
        a = (byte) (a - b);

        System.out.println(" here is A  " + a);
        System.out.println(" here is B  " + b);

    }
}
