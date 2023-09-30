package Momentum;

import java.util.Scanner;

public class Moment1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Plz Enter something : ");
        char x = input.next().charAt(0);

        if(Character.isAlphabetic(x))
        {
            System.out.println("You Have Entered An Alphabet");
        }
        else if (Character.isDigit(x))
        {
            System.out.println("You Have Entered Digit");
        }
        else
        {
            System.out.println("You Have Entered Special Character");
        }

    }
}
