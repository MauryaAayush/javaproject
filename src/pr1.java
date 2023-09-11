
import java.util.Scanner;

public class pr1 {
    public static void main(String [] args) {
        System.out.println("This is about me");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Enter your DOB");
        String DOB = input.next();

        System.out.println("Enter your bloodgroup");
        String bloodgroup = input.next();

        System.out.println("Enter your Contact");
        double Contact = input.nextDouble();

        System.out.println("Enter your Address");
        String Address = input.nextLine();





       // System.out.println("my age is "+age+"hai"+name+".");

    }
}


