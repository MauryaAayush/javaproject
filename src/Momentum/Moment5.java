package Momentum;

import java.util.Scanner;

public class Moment5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        byte ph,ch,bio,maths,com;
        short ans;
        float per;

        System.out.println("Enter the marks of your subject : ");
        System.out.print("Physics : ");
        ph = input.nextByte();
        System.out.print("Chemistry: ");
        ch = input.nextByte();
        System.out.print("Biology : ");
        bio = input.nextByte();
        System.out.print("Maths : ");
        maths = input.nextByte();
        System.out.print("Computer : ");
        com = input.nextByte();

        ans = (short) (ph + ch + bio + maths + com);
        per = (float) ((ans * 100)/500);

        System.out.println("This is the total marks you Obtained = " + ans);
        System.out.println("THis is the percentage you get : " + per);

        if(per >= 90)
        {
            System.out.println("Grade : A");
        }
        else if (per >=80 && per <=89)
        {
            System.out.println("Grade : B");
        }
        else if (per >=70 && per <=79)
        {
            System.out.println("Grade : C");
        }
        else if (per >=60 && per <=69)
        {
            System.out.println("Grade : D");
        }
        else if (per >=33 && per <=59)
        {
            System.out.println("Grade : E");
        }
        else
        {
            System.out.println("Fail 😔😔😔 !! ");
        }
    }
}
