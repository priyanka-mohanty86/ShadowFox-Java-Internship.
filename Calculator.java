import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Calculator =====");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Square Root");
            System.out.println("6 Power");
            System.out.println("7 Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Program closed");
                break;
            }

            double a,b;

            switch(choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a+b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a-b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a*b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();

                    if(b==0)
                        System.out.println("Cannot divide by zero");
                    else
                        System.out.println("Result = " + (a/b));
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(a));
                    break;

                case 6:
                    System.out.print("Enter base and power: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(a,b));
                    break;

                default:
                    System.out.println("Invalid option");

            }
        }

        sc.close();
    }
}