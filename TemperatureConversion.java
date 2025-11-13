import java.util.Scanner;

// Conversion of Temperature from Celsius to Fahrenheit

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius : ");
        float temp = sc.nextFloat();

        float fahrenheit = 9*(temp)/5+32;

        System.out.println("Temp in fahrenheit is : "+fahrenheit);
    }
}
