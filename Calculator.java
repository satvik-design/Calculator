import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;
                do {
                    System.out.println("WELCOME TO CALCULATOR 🧮");
                    System.out.println("ENTER FIRST NUMBER");

                    double a = sc.nextDouble();

                    System.out.println("ENTER SECOND NUMBER");
                    double c = sc.nextDouble();
                    System.out.println("CHOOSE THE OPERATION");
                    System.out.println("1.Addition(+) \n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
                    int b = sc.nextInt();

                    if (b == 1)
                        System.out.println("The Answer: " + (a + c));
                    else if (b == 2)
                        System.out.println("The Answer: " + (a - c));
                    else if (b == 3)
                        System.out.println("The Answer: " + (a * c));
                    else if (b == 4) {
                        if (c != 0)
                            System.out.println("The Answer: " + (a / c));
                        else
                            System.out.println("DIVISION BY ZERO IS INVALID");

                    } else
                        System.out.println("INVALID OPERATION");

                    System.out.println("Do you want to perform another calculation? (y/n): ");
                    choice = sc.next().charAt(0);

                }while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");

       }

    }