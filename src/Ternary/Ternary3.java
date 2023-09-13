package Ternary;

import java.util.Scanner;

public class Ternary3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        short a, b, c, d;

        System.out.print("Enter the value of A : ");
        a = input.nextShort();
        System.out.print("Enter the value of B : ");
        b = input.nextShort();
        System.out.print("Enter the value of C : ");
        c = input.nextShort();
        System.out.print("Enter the value of D : ");
        d = input.nextShort();

        String result = (a > b)? (a > c)? (a > d)? "A is Maximum":"D is Maximum": (c > d)? "C is Maximum": " D is Maximum": (b > c)? (b > d) ? "B is Maximum" :"D is Maximum": (c > d)? "C is Maximum": "D is Maximum";
        System.out.println(result);
    }
}
