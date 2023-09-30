import java.util.Scanner;

public class Myquiz {
    public static void main(String[] args) {
        System.out.println("Hello Students 😎😎");
        System.out.println("Answer the following 10 Question");

        short score = 0;

        Scanner input = new Scanner(System.in);
        // Question 1
        System.out.println("Which is the biggest planet ?");
        System.out.println("A.Earth  B.Sun  C.Jupiter  D.Neptune");
        char ans1 = input.next().charAt(0);
        switch (ans1) {
            case 'a', 'b', 'd' -> {
            }
            case 'c' -> score++;
        }

        //question 2
        System.out.println("Which is the red planet ?");
        System.out.println("A.Earth  B.Mars  C.Venus  D.pluto");
        char ans2 = input.next().charAt(0);
        switch (ans2) {
            case 'a', 'c', 'd' -> {
            }
            case 'b' -> score++;
        }

        //question 3
        System.out.println("Which is the Blue planet ?");
        System.out.println("A.Earth  B.Mars  C.Venus  D.Mercury");
        char ans3 = input.next().charAt(0);
        switch (ans3) {
            case 'c', 'b', 'd' -> {
            }
            case 'a' -> score++;
        }

        //question 4
        System.out.println("Which is nearest planet to the sun ?");
        System.out.println("A.Earth  B.Mars  C.Venus  D.Mercury");
        char ans4 = input.next().charAt(0);
        switch (ans4) {
            case 'a', 'b', 'c' -> {
            }
            case 'd' -> score++;
        }

        //question 5
        System.out.println("Which famous monument in India is also known as the \"Symbol of Love\"?");
        System.out.println("A. India Gate  B.Hawa Mahal  C.Red Fort  D. Taj Mahal");
        char ans5 = input.next().charAt(0);
        switch (ans5) {
            case 'a', 'b', 'c' -> {
            }
            case 'd' -> score++;
        }

        //question 6
        System.out.println("Who was the first woman Prime Minister of India?");
        System.out.println("A.Sushma Swaraj  B.Indira Gandhi  C.Sonia Gandhi  D.Jayalalithaa");
        char ans6 = input.next().charAt(0);
        switch (ans6) {
            case 'a', 'c', 'd' -> {
            }
            case 'b' -> score++;
        }

        //question 7
        System.out.println("In which year did India gain independence from British rule?");
        System.out.println("A. 1942  B. 1945  C.1947  D.1950");
        char ans7 = input.next().charAt(0);
        switch (ans7) {
            case 'a', 'b', 'd' -> {
            }
            case 'c' -> score++;
        }

        //question 8
        System.out.println("Which is the largest state in India by area?");
        System.out.println("A.Maharashtra  B. Uttar Pradesh  C.Madhya Pradesh  D.Rajasthan");
        char ans8 = input.next().charAt(0);
        switch (ans8) {
            case 'a', 'b', 'c' -> {
            }
            case 'd' -> score++;
        }

        //question 9
        System.out.println("What is the currency of India?");
        System.out.println("A.Rupee  B.Rupiah  C. Dollar  D.Yen");
        char ans9 = input.next().charAt(0);
        switch (ans9) {
            case 'c', 'b', 'd' -> {
            }
            case 'a' -> score++;
        }

        //question 10
        System.out.println("Which river is known as the \"Ganges\" in India?");
        System.out.println("A.Brahmaputra  B.Yamuna  C.Indus  D.Ganga");
        char ans10 = input.next().charAt(0);
        switch (ans10) {
            case 'a', 'b', 'c' -> {
            }
            case 'd' -> score++;
        }

        // display score
        System.out.println("Your Score is " + score +" out of 10");

    }
}
