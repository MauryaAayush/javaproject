import java.util.Scanner;

public class Program1 {

    public static void main(String [] args) {
        System.out.println("This is about me");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println(name);

    }
}
