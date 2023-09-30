package Ternary;

import java.util.Scanner;

public class Ternary4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        short a, b, c, d, e;

        System.out.print("Enter the value of A : ");
        a = input.nextShort();
        System.out.print("Enter the value of B : ");
        b = input.nextShort();
        System.out.print("Enter the value of C : ");
        c = input.nextShort();
        System.out.print("Enter the value of D : ");
        d = input.nextShort();
        System.out.print("Enter the value of E : ");
        e = input.nextShort();

        String result = (a > b)? (a > c)? (a > d)? (a > e)? "A is Maximum":"E is Maximum":(d > e)? "D is Maximum":"E is Maximum":(c > d)? (c > e)? " C is Maximum":"E is Maximum":"D is Maximum": (b > c)? (b > d)? (b > e)? "B is Maximum":"E is Maximum":(d > e)? "D is Maximum":"E is Maximum":(c > d)? (c > e)? "C is Maxmimum":"E is Maximum":(d > e)? "D is Maximum":"E is Maximum";
        System.out.println(result);
    }
}
