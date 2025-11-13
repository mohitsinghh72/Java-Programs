import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        char letter = sc.next().trim().charAt(0);

        if(letter >=65 && letter <=91){
            System.out.println("Capital Letter");
        }
        else if(letter>=97 && letter<=123){
            System.out.println("Small letter");
        }else{
            System.out.println("Invalid Character Entered");
        }
    }
}