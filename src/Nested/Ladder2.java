package Nested;

import java.util.Scanner;

public class Ladder2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a,b,c;

        System.out.print("Enter the value of a : ");
        a = input.nextShort();

        System.out.print("Enter the value of b : ");
        b = input.nextShort();

        System.out.print("Enter the value of c : ");
        c = input.nextShort();

        if(a > b && a > c)
        {
            System.out.println("A is a Maximum");
        }
        else if(b > a && b > c)
        {
            System.out.println("B is a Maximum");
        }
        else if(c > a && c > b)
        {
            System.out.println("C is a Maximum");
        }
    }
}
