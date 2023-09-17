import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args)
    {
        System.out.println("Hello Students 😎😎 :");
        System.out.println("Answer the following 10 Question");

        Scanner input = new Scanner(System.in);

        // Question 1
        System.out.println("1.Which is the biggest planet ?");
        System.out.println("A.Earth  B.Sun  C.Jupiter  D.Neptune");
        char ans1 = input.next().charAt(0);
        switch (ans1)
        {
            case 'a', 'b' :
                System.out.println("This is a wrong Answer"); break;

            case 'c' :
                System.out.println("THis a right Answer");

//              Question 2:
                System.out.println("2.Which is the red planet ?");
                System.out.println("A.Earth  B.Mars  C.Venus  D.pluto");
                char ans2 = input.next().charAt(0);
                switch (ans2)
                {
                    case 'a', 'd':
                        System.out.println("This is a wrong Answer");break;
                    case 'b':
                        System.out.println("This a right Answer");

//                        Question 3:

                        System.out.println("3.Which is the Blue planet ?");
                        System.out.println("A.Earth  B.Mars  C.Venus  D.Mercury");
                        char ans3 = input.next().charAt(0);
                        switch (ans3)
                        {
                            case 'a' :
                                System.out.println("This is a right Answer");

//                                Question 4:

                               System.out.println("4.Which is nearest planet to the sun ?");
                                System.out.println("A.Earth  B.Mars  C.Venus  D.Mercury");
                              char ans4 = input.next().charAt(0);
                              switch (ans4)
                              {
                                case 'a' , 'b' , 'c' :
                                    System.out.println("This is a wrong Answer");break;
                                  case 'd' :
                                      System.out.println("This is a right Answer");

                                  //   Question 5:

                                      System.out.println("5.Which famous monument in India is also known as the \"Symbol of Love\"?");
                                      System.out.println("A. India Gate  B.Hawa Mahal  C.Red Fort  D. Taj Mahal");
                                      char ans5 = input.next().charAt(0);
                                      switch (ans5)
                                      {
                                          case 'a', 'b', 'c' :
                                              System.out.println("This is a Wrong Answer");break;
                                          case 'd' :
                                              System.out.println("This a right Answer");
//                                     Question 6:

                                              System.out.println("6.Who was the first woman Prime Minister of India?");
                                              System.out.println("A.Sushma Swaraj  B.Indira Gandhi  C.Sonia Gandhi  D.Jayalalithaa");
                                              char ans6 = input.next().charAt(0);
                                              switch (ans6)
                                              {
                                                  case 'a', 'c', 'd' :
                                                      System.out.println("This is a wrong Answer");break;
                                                  case 'b' :
                                                      System.out.println("This is a Right Answer");
//                                                 Question 7 :
                                                      System.out.println("7.In which year did India gain independence from British rule?");
                                                      System.out.println("A. 1942  B. 1945  C.1947  D.1950");
                                                      char ans7 = input.next().charAt(0);
                                                      switch (ans7)
                                                      {
                                                          case 'a', 'b', 'd' :
                                                              System.out.println("This is a wrong Answer");break;
                                                          case 'c' :
                                                              System.out.println("This is a Right Answer");

//                                                              Question 8 :

                                                              System.out.println("8.Which is the largest state in India by area?");
                                                              System.out.println("A.Maharashtra  B. Uttar Pradesh  C.Madhya Pradesh  D.Rajasthan");
                                                              char ans8 = input.next().charAt(0);
                                                              switch (ans8)
                                                              {
                                                                  case 'a', 'b', 'c' :
                                                                      System.out.println("This is a wrong Answer");break;
                                                                  case 'd' :
                                                                      System.out.println("This is a Right Answer");

//                                                                      Question 9 :

                                                                         System.out.println("9.What is the currency of India?");
                                                                         System.out.println("A.Rupee  B.Rupiah  C. Dollar  D.Yen");
                                                                         char ans9 = input.next().charAt(0);
                                                                         switch (ans9)
                                                                         {
                                                                             case 'b', 'c', 'd' :
                                                                                 System.out.println("This is a wrong Answer");break;
                                                                             case 'a' :
                                                                                 System.out.println("This is a right Answer");

//                                                                                Question 10 :
                                                                                   System.out.println("10.Which river is known as the \"Ganges\" in India?");
                                                                                   System.out.println("A.Brahmaputra  B.Yamuna  C.Indus  D.Ganga");
                                                                                   char ans10 = input.next().charAt(0);
                                                                                   switch (ans10)
                                                                                   {
                                                                                       case 'a', 'b', 'c' :
                                                                                           System.out.println("This is a wrong Answer");break;
                                                                                       case 'd' :
                                                                                           System.out.println("This is a right Answer");break;

                                                                                   }
                                                                         }
                                                              }

                                                      }

                                              }


                                      }

                              }
                            case 'b' :
                                System.out.println("This ia a wrong Answer");break;
                            case 'c', 'd':
                                System.out.println("This is a wrong Answer");break;
                        }
                    case 'c':
                        System.out.println("This is a wrong Answer");break;

                }

            case 'd' :
                System.out.println("This is a Wrong Answer");break;

        }
    }
}
