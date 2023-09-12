package Nested;

import java.util.Scanner;

public class Ladder3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a,b,c,d;

        System.out.print("Enter the value of a : ");
        a = input.nextShort();

        System.out.print("Enter the value of b : ");
        b = input.nextShort();

        System.out.print("Enter the value of c : ");
        c = input.nextShort();

        System.out.print("Enter the value of d : ");
        d = input.nextShort();

        if(a > b && a > c && a > d)
        {
            System.out.println("A is a Maximum");
        }
        else if(b > a && b > c && b > d)
        {
            System.out.println("B is a Maximum");
        }
        else if(c > a && c > b && c > d)
        {
            System.out.println("C is a Maximum");
        }
        else if (d > a && d > b && d > c)
        {
            System.out.println("D is a Maximum");
        }
    }
}
