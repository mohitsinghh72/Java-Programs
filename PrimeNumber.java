import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //Prime numbers starts with 2 and any number which is less than 2 is considered in not prime.

        if(num < 2){
            System.out.println("Not Prime");
            return;
        }

        // to make this program more optimize I have written i*i so that minimum steps it takes to reach the solution.

        for(int i = 2;i*i<=num;i++){
            if(num%i == 0){
                System.out.println("Not Prime");
                return;                 // return statement stops the program whenever it finds not prime number.
            }                           // It is meaning less to go further even we found that the number is not prime.
        }
        System.out.println("Prime");
    }
}
