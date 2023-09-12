package Nested;

import java.util.Scanner;

public class Ladder4 {
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);

        short a,b,c,d,e;


        System.out.print("Enter the value of a : ");
        a = input.nextShort();

        System.out.print("Enter the value of b : ");
        b = input.nextShort();

        System.out.print("Enter the value of c : ");
        c = input.nextShort();

        System.out.print("Enter the value of d : ");
        d = input.nextShort();

        System.out.print("Enter the value of e : ");
        e = input.nextShort();


        if(a > b && a > c && a > d && a > e )
        {
            System.out.println("A is a Maximum");
        }
        else if(b > a && b > c && b > d && b > e)
        {
            System.out.println("B is a Maximum");
        }
        else if(c > a && c > b && c > d && c > e)
        {
            System.out.println("C is a Maximum");
        }
        else if (d > a && d > b && d > c && d > e)
        {
            System.out.println("D is a Maximum");
        }
        else if (e > a && e > b && e > c && e > d)
        {
            System.out.println("E is a Maximum");
        }
    }
}
