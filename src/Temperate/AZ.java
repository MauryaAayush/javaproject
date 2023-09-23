package Temperate;

import java.util.Scanner;

public class AZ {
    public static void main(String[] args)
    {
        System.out.print("Enter your alphabet : ");
        Scanner input = new Scanner(System.in);

        char start = 'a';

        char x =input.next().charAt(0);

        do {
            System.out.print(" " + start);
            start++;
        }
        while (start <= x);
    }
}
