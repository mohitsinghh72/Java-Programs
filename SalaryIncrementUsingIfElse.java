import java.util.Scanner;

public class SalaryIncrementUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary : ");
        int salary = sc.nextInt();

        if(salary<20000){
            System.out.println(salary+2000);
        }else{
            System.out.println(salary+5000);
        }
    }
}
