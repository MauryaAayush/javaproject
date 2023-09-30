package Ternary;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        short a, b, c;

        System.out.print("Enter the value of A : ");
        a = input.nextShort();
        System.out.print("Enter the value of B : ");
        b = input.nextShort();
        System.out.print("Enter the value of C : ");
        c = input.nextShort();

        String result = (a > b)? (a > c)? "A is Maximum":"C is Maximum":(b > c)? "B is Maximum": " c is Maximum";
        System.out.println(result);
    }
}
