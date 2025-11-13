import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want : ");
        int num = sc.nextInt();

        //if user enter number 0 or 1 the program terminate and does not proceed further,therefore return used.
        if(num == 1 ||num == 0){
            System.out.println(num);
            return;
        }
        int a = 0;
        System.out.println(a);

        int b = 1;
        System.out.println(b);

        for (int i = 2;i<=num;i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}