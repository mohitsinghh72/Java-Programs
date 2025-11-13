import java.util.Scanner;


public class CalculatorFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Operation : ");
        char op = sc.next().trim().charAt(0); // Extra space from the operator removed

        if(op == '+' || op == '-' || op == '*' || op == '/'){ // operator must be in 4 of them
            if(op == '+'){
                System.out.println(num1+num2);
                return;                             // Here return means that program will not proceed further
            }
            if(op == '-'){
                System.out.println(num1-num2);
                return;
            }
            if(op == '*'){
                System.out.println(num1*num2);
                return;
            }
            if(op == '/'){
                if(num2!=0){
                    System.out.println(num1/num2);
                    return;
                }
                else{
                    System.out.println("Invalid value");
                    return;
                }
            }
        }else{
            System.out.println("Invalid Operation");  // prints invalid if operator is not one of 4
        }
    }
}