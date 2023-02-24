import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args) {//Creating scanner to take input from the user
        Scanner input = new Scanner("100");//Put in a value for celsius
        double celsius;
        do {
            System.out.print("Enter the temperature in Celsius: ");//Taking temperature in C to covert it to F
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
            celsius = input.nextDouble();//Converting C to F
        } while (celsius < -273.15); // Loop until a valid temperature is entered
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit.");
        input.close();
    }
}
