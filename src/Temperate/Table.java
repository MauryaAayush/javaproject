package Temperate;

import java.util.Scanner;

public class Table {
    public static void main(String[] args)
    {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);

        byte a = 1;
        short x;
        x = input.nextShort();

        do {
            System.out.println(x+"*"+a+"="+x*a);
            a++;
        }
        while (a <= 10);

    }
}
