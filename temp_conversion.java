import java.util.Scanner;

public class temp_conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Temperature Conversion Program");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("   Celsius to Kelvin");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 3) {
                System.out.println("Exiting the program.");
                break;
            }
            
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double convertedTemperature = 0.0;
            
            switch (choice) {
                case 1:
                    convertedTemperature = celsiusToFahrenheit(celsius);
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, convertedTemperature);
                    convertedTemperature = celsiusToKelvin(celsius);
                    System.out.printf("%.2f Celsius is %.2f Kelvin%n", celsius, convertedTemperature);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
