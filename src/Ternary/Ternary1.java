package Ternary;

import java.util.Scanner;

public class Ternary1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a, b;

        System.out.print("Enter the value of A : ");
        a = input.nextShort();
        System.out.print("Enter the value of B : ");
        b = input.nextShort();

        String result = (a > b) ? "A is Maximum" : "B is Maximum";
        System.out.println(result);

    }
}
