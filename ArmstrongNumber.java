import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();                     // Taking input by user
        int original = num;
        int counter = count(num);           // counter function counted the total number of digits that are present in the number given by user
        int arms = 0;
        while(num!=0){                              // It checks and add the digit by multiplying through the respected counted number
            int last = num%10;
            int ans = multiplyDigit(last,counter);
            arms = arms+ans;
            num = num/10;
        }
        if(arms == original){                       // If number matched to the original raw number then it is armstrong otherwise not.
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }

    // It counted the total number of digits that are present in the given number

    static int count(int num){
        int count = 0;
        while(num!=0){
            int last = num%10;
            count = count +1;
            num = num/10;
        }
        return count;
    }

    // multiply the value respected times as the total count of number

    static int multiplyDigit(int last,int counted){
        int multivalue = 1;
        for(int i = 1;i<=counted;i++){
            multivalue = multivalue*last;
        }
        return multivalue;
    }
}