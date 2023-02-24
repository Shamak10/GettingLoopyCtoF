import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        do {
            System.out.print("Enter the temperature in Celsius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
            celsius = input.nextDouble();
        } while (celsius < -273.15); // Loop until a valid temperature is entered
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit.");
        input.close();
    }
}