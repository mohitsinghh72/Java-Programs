import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        //What is type conversion ? changing data type of value.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float Value : ");
        float num = sc.nextFloat();
        System.out.println(num); // This is called implicit datatype conversion also called Type Casting.
        // also called Widening Conversion


        // Type Conversion Explicitly also called Type Casting.
        //Converting Larger datatype to smaller one. also called Narrowing Conversion

        float num = 10.34f;
        int num2 = (int)num;
        System.out.println( num2); // This is called type Casting.
    }
}
