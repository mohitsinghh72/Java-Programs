import java.util.Scanner;

public class CalculatorFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {                  // This will work continuously until user wants to end the program
            System.out.print("Enter the operator : ");          // asking for the operator
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("Enter the First Number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter the Second Number : ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Invalid");
                        continue;
                    } else {
                        ans = num1 / num2;
                    }
                }

            } else if (op == 'x' || op == 'X') {            //program will end when entering x
                break;

            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }
    }
}
