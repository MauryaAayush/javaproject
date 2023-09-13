import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        System.out.println("Choose from 1 to 12 to select your Month");
        Scanner input = new Scanner(System.in);
        short Month;
        System.out.println("Enter your number : ");
         Month = input.nextShort();

        switch (Month)
        {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Plz Enter the valid number !!!??");
        }
    }
}
