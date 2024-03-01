import java.util.Scanner;

public class Operations {

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    System.out.println("");
                    System.out.println("Perform the arithmetic operations by choosing the number");
                    System.out.println("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Choose the number to do the calculation: ");
                    System.out.println("Choose 1 for Addition");
                    System.out.println("Choose 2 for Subtraction");
                    System.out.println("Choose 3 for Multiplication");
                    System.out.println("Choose 4 for Division");
                    System.out.println("Choose 5 for Module operation");
                    System.out.println("Choose 6 to exit");
                    int n = scanner.nextInt();
                    switch (n){
                        case 1:
                            int add = num1 + num2;
                            System.out.println("Result " + add);
                            break;
                        case 2:
                            int sub = num1 - num2;
                            System.out.println("Result " + sub);
                            break;
                        case 3:
                            int multi = num1 * num2;
                            System.out.println("Result " + multi);
                            break;
                        case 4:
                            int div = num1 / num2;
                            System.out.println("Result " + div);
                            break;
                        case 5:
                            int mod = num1  % num2;
                            System.out.println("Result " + mod);
                            break;
                        case 6:
                            System.exit(0);
                        default:
                            System.out.println("Options is not available. Please check your choice");
                    }
                }
            }

        }

    }
