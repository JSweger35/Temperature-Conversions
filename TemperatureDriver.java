import java.util.Scanner;
/**
 * TemperatureDriver runs and tests the Temperature class.
 * 
 * @author Jake Sweger
 * @version 3.0
 */
public class TemperatureDriver {
    /**
     * main() reads Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents.
     */
    public static void main(String[] args) {
        double inputTemperature = 0.0;
        Scanner keyInput = new Scanner(System.in); 
        Temperature t1;
        String temperatureType = "";
        boolean moreTemperatures = true;
        boolean goodType = false;

        while (moreTemperatures) {
            System.out.print("Enter a temperature type (C=Celsius, " +
                "F=Fahrenheit, K=Kelvin, Q=Quit): ");
            temperatureType = keyInput.next();
            goodType = false;
            while ( ! goodType) {
                if (temperatureType.equalsIgnoreCase("Q") ||
                temperatureType.equalsIgnoreCase("C") || 
                temperatureType.equalsIgnoreCase("F") ||
                temperatureType.equalsIgnoreCase("K")) {
                    goodType = true;
                }
                else {
                    System.out.println("Invalid temperature type!");
                    System.out.println("The type must be C, F, K, or Q.");
                    System.out.print("Please enter the temperature type again: ");
                    temperatureType = keyInput.next();
                }
            }
            if (temperatureType.equalsIgnoreCase("Q")) { // quit
                moreTemperatures = false;
                System.out.println("\nProgram ended.");
            }
            else {
                System.out.print("Enter a temperature: ");
                inputTemperature = keyInput.nextDouble();
                t1 = new Temperature(temperatureType, inputTemperature);

                if (temperatureType.equalsIgnoreCase("F")) {
                    System.out.println("You entered " + inputTemperature + 
                        " degrees Fahrenheit");
                    System.out.println("which is " + t1.getDegreesCelsius() + 
                        " degrees Celsius"); 
                    System.out.println("and " + t1.getDegreesKelvin() + 
                        " degrees Kelvin.");
                }
                else if (temperatureType.equalsIgnoreCase("C")) {
                    System.out.println("You entered " + inputTemperature + 
                        " degrees Celsius");
                    System.out.println("which is " + t1.getDegreesFahrenheit() + 
                        " degrees Fahrenheit"); 
                    System.out.println("and " + t1.getDegreesKelvin() + 
                        " degrees Kelvin.");
                }
                else if (temperatureType.equalsIgnoreCase("K")) {
                    System.out.println("You entered " + inputTemperature + 
                        " degrees Kelvin");
                    System.out.println("which is " + t1.getDegreesCelsius() + 
                        " degrees Celsius"); 
                    System.out.println("and " + t1.getDegreesFahrenheit() + 
                        " degrees Fahrenheit.");
                }
            }
        }
    }
}