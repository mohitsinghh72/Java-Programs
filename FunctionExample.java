import java.util.Scanner;

public class FunctionExample {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("The sum is : "+sum);
    }
}