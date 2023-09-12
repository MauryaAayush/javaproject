package Nested;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a,b;

        System.out.print("Enter the value of a : ");
        a = input.nextShort();

        System.out.print("Enter the value of b : ");
        b = input.nextShort();

        if(a > b)
        {
            System.out.println("A is a Maximum");
        }
        else if(b > a)
        {
            System.out.println("B is a Maximum");
        }
    }
}
