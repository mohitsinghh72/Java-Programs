import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int reverse = 0;

        while(num!=0){
            int lastdigit = num%10;    // Taking the last digit of number
            reverse = reverse*10+lastdigit;   // adding the last digit in the reverse from the start

            num = num/10;        // removing after successfully use the last digit of number
        }
        System.out.println(reverse);    // printing the reversed number
    }
}
