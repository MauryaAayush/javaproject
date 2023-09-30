package Nested;

import java.util.Scanner;

public class Nested1 {
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

        if(a < b)
        {
            if(a < c)
            {
                System.out.println("A is Minimum");
            }
            else
            {
                System.out.println("C is Minimum");
            }
        }
        else
        {
            if(b < c)
            {
                System.out.println("B is Minimum");
            }
            else
            {
                System.out.println("C is Minimum");
            }

        }

    }
}
