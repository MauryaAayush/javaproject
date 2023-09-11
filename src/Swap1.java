import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        //("Here is a swaping program");

        byte a,b,c;

        System.out.print("Enter the value (A) : ");
        a = input.nextByte();
        System.out.print("Enter the value (B) : ");
        b = input.nextByte();

        c = a;
        a =  (b);
        b =  (c);

        System.out.println(" here is A  " + a);
        System.out.println(" here is B  " + b);

    }
}
