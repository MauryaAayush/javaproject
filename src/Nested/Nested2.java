package Nested;

import java.util.Scanner;

public class Nested2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        short a,b,c,d;

        System.out.print("Enter the value of a : ");
        a = input.nextShort();

        System.out.print("Enter the value of b : ");
        b = input.nextShort();

        System.out.print("Enter the value of c : ");
        c = input.nextShort();

        System.out.print("Enter the value of d : ");
        d = input.nextShort();

       if(a > b)
       {
          if(a > c)
          {
              if(a > d)
              {
                  System.out.println("A is Maximum");
              }
              else
              {
                  System.out.println("D is Maximum");
              }
          }
          else
          {
              System.out.println("C is Maximum");
          }
       }
       else
       {
           if(b > c)
           {
               if(b > d)
               {
                   System.out.println("B is Maximum");
               }
               else
               {
                   System.out.println("D is Maximum");
               }
           }
           else
           {
               if(c > d)
               {
                   System.out.println("C is Maximum");
               }
               else
               {
                   System.out.println("D is Maximum");
               }
           }
       }
    }
}
