package Momentum;

import java.util.Scanner;

public class Momentum4 {
    public static void main(String[] args)
    {
        System.out.println("Chose 1st letter of week names to get you day name");
        String day;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character : ");
         day = input.next();

        switch (day)
        {
            case "m" -> System.out.println("Monday");
            case "t" -> System.out.println("Tuesday");
            case "w" -> System.out.println("Wednesday");
            case "T" -> System.out.println("Thursday");
            case "f" -> System.out.println("Friday");
            case "s" -> System.out.println("Saturday");
            case "S" -> System.out.println("Sunday");
        }

    }
}
