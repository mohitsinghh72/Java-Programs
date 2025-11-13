import java.util.Scanner;

            // Counts the number of time target digit appears in the number

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the number you want to find : ");
        int target = sc.nextInt();

        int count = 0;          // it Counts the number of time the target digit present in num

        while(num != 0){
            int lastDigit = num%10;    // it detects the last digit of num is equals to the target digit or not
            if(lastDigit == target){   // if target digit and last digit of num matches then count is increased by 1
                count = count+1;
            }
            num = num/10;       // otherwise it delete the last digit from the num
        }
        System.out.println(count);      //prints the total count of target digit
    }
}