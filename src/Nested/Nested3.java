package Nested;

import java.util.Scanner;

public class Nested3 {
    public static void main (String[] args)
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

        if(a < b)
        {
           if (a < c)
           {
               if(a < d)
               {
                if(a < e)
                {
                    System.out.println("A is Minimum");
                }
                else
                {
                    System.out.println("E is Minimum");
                }
               }
               else
               {
                   System.out.println("D is Minimum");
               }
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
                if(b < d)
                {
                    if(b < e)
                    {
                        System.out.println("B is Minimum");
                    }
                    else
                    {
                        System.out.println("E is Minimum");
                    }
                }
                else
                {
                    if(d < e)
                    {
                        System.out.println("D is Minimum");
                    }
                    else
                    {
                        System.out.println("E is Minimum");
                    }

                }
            }
            else
            {
                if(c < d)
                {
                    System.out.println("C is Minimum");
                }
                else
                {
                    System.out.println("D is Minimum");
                }
            }
        }
    }
}
