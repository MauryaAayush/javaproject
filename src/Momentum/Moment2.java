package Momentum;

import java.util.Scanner;

public class Moment2 {
    public static void main(String[] args)
    {
        short now,ans;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        short a = input.nextShort();

        ans = (short) (a / 2);
        now = (short) (ans * 2);

        if(now == a)
        {
            System.out.println("You Have Entered Even number");
        }
        else
        {
            System.out.println("You Have Entered Odd Number");
        }

    }
}
