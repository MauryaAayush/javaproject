import java.util.Scanner;
public class pr1 {
    public static void main(String [] args) {
        System.out.println("This is about me");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.print("Enter your age : ");
        byte age = input.nextByte();

        System.out.print("Enter your DOB : ");
        String DOB = input.next();

        System.out.print("Enter your bloodgroup : ");
        String bloodgroup = input.nextLine();
        bloodgroup = input.nextLine();

        System.out.print("Enter your Contact : ");
        long Contact = input.nextLong();

        System.out.print("Enter your Add : ");
        String Add = input.nextLine();
        Add = input.nextLine();

        System.out.print("Enter your School : ");
        String School = input.nextLine();

        System.out.print("Enter your Hobby : ");
        String Hobby = input.nextLine();

        System.out.print("Enter your percentage : ");
        Float percentage = input.nextFloat();

        System.out.println("My name is "+name+" and i am "+age+" years old .My date of birth is "+DOB+". Here is my contact "
        + Contact +". Now here is my address" + Add + ". I was studying in " + School + " and my hobby is "
        + Hobby + " and i got " + percentage + "% in my 12th class");

    }
}


